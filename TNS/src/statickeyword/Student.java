package statickeyword;

public class Student {
	int usn;
	String name;
	static String college="jssate";
	//static method
	static void change() {
		college="jss";
	}
	
	@Override
	public String toString() {
		return "Student[usn=" + usn + ", name=" +name + ", college=" + college+ "]";
	}
		public static void main(String[] args) {
			Student s1=new Student();
			s1.usn=2;
			s1.name="shreya";
			change();
			Student.change();
			s1.change();
			System.out.println(s1);
		
		
	}
	
	
	//non static method
	

}
