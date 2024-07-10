package exceptionexamples;

public class Mains {
	public static void main(String[]args) {
	System.out.println("first line ");
	System.out.println("second line");//exception handling using try catch
	try {
		int [] myIntArray=new int[] {1,2,3};
		print(myIntArray);
		}
	catch(Exception e) {
		System.out.println(e);
	}
	//int [] myIntArray=new int[] {1,2,3};
	//print(myIntArray);
	System.out.println("third line");

}
//public static void main(String[]args) {
public static void print(int[]arr) {
	System.out.println(arr[3]);
	System.out.println("forth ele succesfully displayed");
}

}
