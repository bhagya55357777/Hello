package superkeyword;
 class Animal {
	String color="brown";
	void eat(){
		System.out.println("eating");
	}
}
class dog extends Animal{
	String color="white";
	void eat() {
		System.out.println("eating meat");
		
	}
	void call() {
		System.out.println(color);
		System.out.println(super.color);
		System.out.println(super.color);
		super.eat();
	}
}
public class variable{
public static void main(String[] args) {
	dog d=new dog();
	System.out.println(d.color);
	d.call();
	d.eat();
	
		
	}
	
}

	


