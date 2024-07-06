package statickeyword;

public class method {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.usn=2;
		s1.name="shreya";
		Student.change();
		s1.change();
		System.out.println(s1);
	}

}
