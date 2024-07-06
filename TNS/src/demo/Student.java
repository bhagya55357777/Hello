package demo;

public class Student {
	//instance variable
	int usn;
	String name;
	float marks;
	char gender;
	//local variable
	void add(int id,String fullname,float scores) {
		usn=id;
		name=fullname;
		marks=scores;
		System.out.println(id);
		
	}
	Student(){
		
	}
	Student(int id,String fullname,float scores){
		usn=id;
		name=fullname;
		marks=scores;
	}
public static void main(String[]args) {
	int i=5;
	Student s1=new Student();
	//initialisation
	//1.using referene variable
	s1.usn=1;
	s1.name="bhagya";
	s1.marks=98;
	s1.gender='f';
	
	//2.using method
	System.out.println(s1.usn+" "+s1.name+" "+s1.marks);
		
		
	}


}
