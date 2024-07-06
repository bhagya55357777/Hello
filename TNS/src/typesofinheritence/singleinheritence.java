package typesofinheritence;

class Annimal{
	void eat() {
		
	}
}
class doggy extends Annimal{
	void bark() {
		
	}
}
public class singleinheritence {
	public static void main(String[]args) {
		Annimal a=new Annimal();
		a.eat();
		doggy d=new doggy();
		d.eat();
		d.bark();
		Annimal a1=new doggy();
		a1.eat();
	
		
	}

}
