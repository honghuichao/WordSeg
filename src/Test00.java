import java.io.IOException;

/*
 * @author Shifu
 *@version 1.0
 */
public class Test00 {
	/**
	 * ≤‚ ‘¿‡
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Administrator\\Desktop\\11";
		ReadFileContent rf= new ReadFileContent();
		rf.traverseFolder(path);
	}

}
