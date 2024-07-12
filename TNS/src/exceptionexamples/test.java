package exceptionexamples;
import java.io.FileInputStream;
public class test {
	public static void main(String[]args) {
		
		try {
			//FileInputStream fis=null;
			fis=new FileInputStream("D:/myfile.txt");
		}
		catch(Exception e) {
			System.out.println("FileNotFoundException has occured");
			//System.out.println(e);
		}
		int k;
		try{
		   while((k=fis.read()) !=-1)
		{
			System.out.println((char)k);	
		}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		fis.close();
		
	}
}
