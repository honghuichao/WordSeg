
  
import java.io.IOException;  
import java.io.StringReader;  
  
import org.wltea.analyzer.core.IKSegmenter;  
import org.wltea.analyzer.core.Lexeme;  
  
public class Test3 {  
      
    public static void main(String[] args) throws IOException {  
        String text=" 我的 本报北京１月３日讯  记者谢联辉、黄振中报道：我国民间首次江河源环境保护工程——“保护长江源，爱我大自然”活动今天拉开序幕。针对长江河源区草场退化、荒原沙化和野生动物被大量捕杀等触目惊心的事实，广大环保工作人员和新闻界人士呼吁：爱我大自然，救我母亲河。据悉，这项活动将历时５年，计划组织４次科学考察探险，建立自然环境保护站，并借助电视、报纸、图片等各种媒介进行宣传报道。";
        StringReader sr=new StringReader(text);  
        IKSegmenter ik=new IKSegmenter(sr, true);  
        Lexeme lex=null;  
        while((lex=ik.next())!=null){  
            System.out.print(lex.getLexemeText()+", ");  
        }  
    }  
  
}  