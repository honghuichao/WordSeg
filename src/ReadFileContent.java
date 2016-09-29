
import java.io.IOException;  
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;  
import org.apache.lucene.analysis.TokenStream;  
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;  
import org.wltea.analyzer.lucene.IKAnalyzer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;
/**
 * 
 * @author Shifu
 * @version 1.0
 *
 */
public class ReadFileContent {
	/**
	 * ���ܣ���ȡһ���ļ����µ������ļ������ݣ��������ļ��еģ�
	 * @param path ָ��Ҫ��ȡ���ļ���
	 */
	public void traverseFolder(String path) {
		/**
		 * ʹ�õݹ�ķ��������ļ��е�ѭ����ȡ���ҵ������ļ���·��������readFile�������������ļ��Ķ�ȡ��
		 */
		String temp=" ";
		//String temp;
		 List<String>    list =    new    ArrayList<String>();  
		
		////////////////////////////
		
		
		////////////////////////
		String path_divide_word="C:\\Users\\Administrator\\Desktop\\fenci\\divide_word.txt";
   	 File file0=new File(path_divide_word);
   	 if(!file0.exists()){
   		 try {
			file0.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���÷ִʺ󱣴���ļ�Ϊdivide_word.txt�ļ�
   	 }
		////////////////////////
		
		
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("�ļ����ǿյ�!");
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						traverseFolder(file2.getAbsolutePath());
					} else {
						
						String temp1=" ";
						
						temp=readFile(file2.getAbsolutePath());//����readFile�������ж�ȡ�ļ�
						 Analyzer anal=new IKAnalyzer(true);       
					        StringReader reader=new StringReader(temp);  
					        //�ִ�  
					        TokenStream ts=anal.tokenStream("", reader);  
					        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
					        //�����ִ�����  
					        try {
								while(ts.incrementToken()){  
								    //System.out.print(term.toString()+"|"); 
									
								   
								    temp1=term.toString()+" ";
								   
								  System.out.print(temp1);
								  ////
					
								  
								  
								  
								  ////
								}
								

								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}  
					        reader.close();  
					        anal.close();
					        System.out.println();  
					        
					}
				}
			}
		} else {
			System.out.println("�ļ�������!");
		}
		
		
		
	}
	
	/**
	 * ���ܣ�����һ���ļ���·���������ļ�������ֱ�Ӵ�ӡ������̨��
	 * @param filePath Ҫ��ȡ�ļ���Ŀ¼
	 */

	
	public static String readFile(String filePath) {  
		String line = null;  
        String temp="";
        try {  
            BufferedReader in = new BufferedReader(new FileReader(filePath));  
            
            
            while ((line = in.readLine()) != null) { 
            	
            	temp=temp+line;
                //System.out.println(line);  
            }  
            in.close();
            
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        
        return temp;
    }  
	
	
	
	
	////////////////
	
	public static String readnewline(String filePath) {  
		String line = null;  
        String temp="";
        try {  
            BufferedReader in = new BufferedReader(new FileReader(filePath));  
            
            
            while ((line = in.readLine()) != null) { 
            	
            	temp=temp+line;
                //System.out.println(line);  
            }  
            in.close();
            
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        
        return temp;
    }  
	
	
	//////////////////
}
	
	
