
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
	 * 功能：读取一个文件夹下的所有文件的内容（包括子文件夹的）
	 * @param path 指定要读取的文件夹
	 */
	public void traverseFolder(String path) {
		/**
		 * 使用递归的方法进行文件夹的循环读取，找到所有文件的路径，调用readFile（）方法进行文件的读取。
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
		}//设置分词后保存的文件为divide_word.txt文件
   	 }
		////////////////////////
		
		
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("文件夹是空的!");
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						traverseFolder(file2.getAbsolutePath());
					} else {
						
						String temp1=" ";
						
						temp=readFile(file2.getAbsolutePath());//调用readFile方法进行读取文件
						 Analyzer anal=new IKAnalyzer(true);       
					        StringReader reader=new StringReader(temp);  
					        //分词  
					        TokenStream ts=anal.tokenStream("", reader);  
					        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
					        //遍历分词数据  
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
			System.out.println("文件不存在!");
		}
		
		
		
	}
	
	/**
	 * 功能：传入一个文件的路径，将该文件的内容直接打印到控制台。
	 * @param filePath 要读取文件的目录
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
	
	
