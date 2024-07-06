package typesofinheritence;
class animal{
	void eat() {
		
	}
}
class dogy extends animal{
	void bark() {
		
	}
}
class puppy extends dogy{
	void weep() {
		
	}
}
public class multilevel {
	public static void main(String[]args) {
		animal a=new animal();
		a.eat();
		dogy d=new dogy();
		d.eat();
		d.bark();
		puppy p=new puppy();
		p.eat();
		p.bark();
		p.weep();
		
		animal a1=new dogy();
		animal a2=new puppy();
		dogy d1=new puppy();
	}

}
