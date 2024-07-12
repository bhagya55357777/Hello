package customexception;
import java.util.Scanner;
public class myclass {
	public static void main(String[]args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur age");
		int age=sc.nextInt();
		System.out.println("enter ur weight");
		int weight=sc.nextInt();
		Method.validate(age,weight);
	}

}
