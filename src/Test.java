

import java.io.StringReader; 

import org.apache.lucene.analysis.Analyzer; 
import org.apache.lucene.analysis.TokenStream; 
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute; 

import org.wltea.analyzer.lucene.IKAnalyzer;
 

/**
  * IKAnalyzer �ִ�������
  * @author Luxh
  */
 public class Test {
     
    
     public void testIKAnalyzer() throws Exception {
         
         String keyWord = "2012��ŷ�ޱ���ǿ��";
         
         IKAnalyzer analyzer = new IKAnalyzer();
         
         //ʹ�����ִܷ�
         analyzer.setUseSmart(true);
         
         //��ӡ�ִʽ��
         printAnalysisResult(analyzer,keyWord);
         
     }
     
     /**
      * ��ӡ�������ִ����ķִʽ��
      * @param analyzer �ִ���
      * @param keyWord �ؼ���
      * @throws Exception
      */
     private void printAnalysisResult(Analyzer analyzer, String keyWord) throws Exception {
         System.out.println("��ǰʹ�õķִ�����" + analyzer.getClass().getSimpleName());
         TokenStream tokenStream = analyzer.tokenStream("content", new StringReader(keyWord));
         tokenStream.addAttribute(CharTermAttribute.class);
         while (tokenStream.incrementToken()) {
             CharTermAttribute charTermAttribute = tokenStream.getAttribute(CharTermAttribute.class);
             System.out.println(new String(charTermAttribute.buffer()));
         }
     }
 }
    
