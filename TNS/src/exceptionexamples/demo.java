package exceptionexamples;

public class demo {
	public static void main(String[]args) {
		
	int a=10;
	//int b=0;
	int b=2;
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("welcome");

	}
	}

}
