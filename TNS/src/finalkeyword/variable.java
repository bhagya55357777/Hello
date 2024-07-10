package finalkeyword;
class Student{
	int id=1;
	String name="Nikitha";//value cant be modified
final	String college="jss";
}

public class variable {
	public static void main(String[]args) {
		Student S1=new Student();
		S1.college="jssate";
		System.out.println(S1.college);
		
	}

}
