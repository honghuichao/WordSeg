
  
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
    		 file0.createNewFile();//设置分词后保存的文件为divide_word.txt文件
    	 }
    	  String path="C:\\Users\\Administrator\\Desktop\\11";//设置一级目录路径
    	  File file=new File(path);
    	  File[] tempList = file.listFiles();
    	  System.out.println("一级目录下对象个数："+tempList.length);//包含文件和文件夹的对象个数
    	  for (int i = 0; i < tempList.length; i++) {
    	  if (tempList[i].isFile()) {
    		   //如果是文件则执行读取操作，读取该一级目录的所有文件
    		      
    	    System.out.println("一级目录文 件："+tempList[i]);
    	    
    	    {
    	    	//////////////////
    	    	//File file3=new File(tempList[i].toString());
    	    	
    	        temp_readFile=temp_readFile+readFile(tempList[i].toString());
    	       
    	        System.out.println("一级目录文 件："+tempList[i].toString());
    	        
    	        
    	    	
    	    	
    	  
    	    	////////////////
    	    	//////////////////
    	    	
    	    	
    	    	
    	    	
    	    }
    	   }
    	   if (tempList[i].isDirectory()) {//如果是文件夹，再读取该文件夹下的内容，文件名为tempList[i]
    	    System.out.println("一级目录文件夹："+tempList[i]);
          ///////////////////
      	  File file_under=new File(tempList[i].toString());
      	  File[] tempList_under = file_under.listFiles();
      	  System.out.println("该二级目录下对象个数："+tempList_under.length);
      	  for (int j = 0; j < tempList_under.length; j++) {
      	   if (tempList_under[j].isFile()) {
      	    System.out.println("二级目录文  件："+tempList_under[j]);
      	    /////读取该二级目录下文件的所有文件；文件名为tempList_under[j]
      	    {
      	    	
      	     /////////////////////
      	    //File file4=new File(tempList[j].toString());
      	    	
      	   temp_readFile=temp_readFile+readFile(tempList[j].toString());
      	    
      	    	
      	    	
      	    	
      	    	
      	    	////////////////////
      	    	
      	    	
      	    	
      	    }
      	    
      
      	   }
      	   if (tempList_under[j].isDirectory()) {
      	    System.out.println("二级目录文件夹："+tempList_under[j]);}
    	    
    	    /////////////////////////
    	    
    	   }
    	  }
    	 
    	
    	  }
    	
    	
    	
    	
    	
         String text1="cccc";
        //创建分词对象  
        Analyzer anal=new IKAnalyzer(true);       
        StringReader reader=new StringReader(text1);  
        //分词  
        TokenStream ts=anal.tokenStream("", reader);  
        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
        //遍历分词数据  
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