package exceptionexamples;
import java.io.IOException;
public class throwexample {
	public static void validate(int age)throws IOException {
		//try  {
		if(age<21 || age>27)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("eligible to attend Military Selection ");
	}
	public static void main(String[] args)throws IOException {
		try {
			validate(30);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("rest of the code..");
		
	}

}
