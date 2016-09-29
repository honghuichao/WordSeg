
  
import java.io.IOException;  
import java.io.StringReader;  
  
import org.wltea.analyzer.core.IKSegmenter;  
import org.wltea.analyzer.core.Lexeme;  
  
public class Test3 {  
      
    public static void main(String[] args) throws IOException {  
        String text=" �ҵ� �����������£���Ѷ  ����л���ԡ������б������ҹ�����״ν���Դ�����������̡�������������Դ�����Ҵ���Ȼ�������������Ļ����Գ�����Դ���ݳ��˻�����ԭɳ����Ұ�����ﱻ������ɱ�ȴ�Ŀ���ĵ���ʵ����󻷱�������Ա�����Ž���ʿ���������Ҵ���Ȼ������ĸ�׺ӡ���Ϥ����������ʱ���꣬�ƻ���֯���ο�ѧ����̽�գ�������Ȼ��������վ�����������ӡ���ֽ��ͼƬ�ȸ���ý���������������";
        StringReader sr=new StringReader(text);  
        IKSegmenter ik=new IKSegmenter(sr, true);  
        Lexeme lex=null;  
        while((lex=ik.next())!=null){  
            System.out.print(lex.getLexemeText()+", ");  
        }  
    }  
  
}  