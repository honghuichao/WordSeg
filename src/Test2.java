
  
import java.io.IOException;  
import java.io.StringReader;  
import org.apache.lucene.analysis.Analyzer;  
import org.apache.lucene.analysis.TokenStream;  
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;  
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.BufferedReader;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileReader;

  
public class Test2 {  
    public static void main(String[] args) throws IOException { 
    	
    	
    	 String temp_readFile=null;
    	 String temp_devide=null;
    	 
    	 String path_divide_word="C:\\Users\\Administrator\\Desktop\\fenci\\divide_word.txt";
    	 File file0=new File(path_divide_word);
    	 if(!file0.exists()){
    		 file0.createNewFile();//���÷ִʺ󱣴���ļ�Ϊdivide_word.txt�ļ�
    	 }
    	  String path="C:\\Users\\Administrator\\Desktop\\11";//����һ��Ŀ¼·��
    	  File file=new File(path);
    	  File[] tempList = file.listFiles();
    	  System.out.println("һ��Ŀ¼�¶��������"+tempList.length);//�����ļ����ļ��еĶ������
    	  for (int i = 0; i < tempList.length; i++) {
    	  if (tempList[i].isFile()) {
    		   //������ļ���ִ�ж�ȡ��������ȡ��һ��Ŀ¼�������ļ�
    		      
    	    System.out.println("һ��Ŀ¼�� ����"+tempList[i]);
    	    
    	    {
    	    	//////////////////
    	    	//File file3=new File(tempList[i].toString());
    	    	
    	        temp_readFile=temp_readFile+readFile(tempList[i].toString());
    	       
    	        System.out.println("һ��Ŀ¼�� ����"+tempList[i].toString());
    	        
    	        
    	    	
    	    	
    	  
    	    	////////////////
    	    	//////////////////
    	    	
    	    	
    	    	
    	    	
    	    }
    	   }
    	   if (tempList[i].isDirectory()) {//������ļ��У��ٶ�ȡ���ļ����µ����ݣ��ļ���ΪtempList[i]
    	    System.out.println("һ��Ŀ¼�ļ��У�"+tempList[i]);
          ///////////////////
      	  File file_under=new File(tempList[i].toString());
      	  File[] tempList_under = file_under.listFiles();
      	  System.out.println("�ö���Ŀ¼�¶��������"+tempList_under.length);
      	  for (int j = 0; j < tempList_under.length; j++) {
      	   if (tempList_under[j].isFile()) {
      	    System.out.println("����Ŀ¼��  ����"+tempList_under[j]);
      	    /////��ȡ�ö���Ŀ¼���ļ��������ļ����ļ���ΪtempList_under[j]
      	    {
      	    	
      	     /////////////////////
      	    //File file4=new File(tempList[j].toString());
      	    	
      	   temp_readFile=temp_readFile+readFile(tempList[j].toString());
      	    
      	    	
      	    	
      	    	
      	    	
      	    	////////////////////
      	    	
      	    	
      	    	
      	    }
      	    
      
      	   }
      	   if (tempList_under[j].isDirectory()) {
      	    System.out.println("����Ŀ¼�ļ��У�"+tempList_under[j]);}
    	    
    	    /////////////////////////
    	    
    	   }
    	  }
    	 
    	
    	  }
    	
    	
    	
    	
    	
         String text1="cccc";
        //�����ִʶ���  
        Analyzer anal=new IKAnalyzer(true);       
        StringReader reader=new StringReader(text1);  
        //�ִ�  
        TokenStream ts=anal.tokenStream("", reader);  
        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
        //�����ִ�����  
        while(ts.incrementToken()){  
            System.out.print(term.toString()+"|");  
        }  
        reader.close();  
        anal.close();
        System.out.println();  
        
        
        
        
        
    }  
    
   
    
    
    ////////////////////////
    
    
	public  static String readFile(String filePath) throws IOException {  
        
        BufferedReader in = new BufferedReader(new FileReader(filePath));  
        String line = null;  
        while (line!= null){  
        	
           line=line+in.readLine();
           if(in.readLine()==null)line=null;
           
        }
        in.close();
        return line;
    

   
   
}

    
    
    
    
    
    /////////////////////////////
    
    
    
    
    
 
    
  
  
}  