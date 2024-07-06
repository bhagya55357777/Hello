package superkeyword;
class Animalll{
	String color="brown";

class cat extends Animalll{
	String color="white";
	void call() {
		System.out.println(color);
	}
}
}
public class varriable {
	public static void main(String[]args) {
		cat c=new cat();
		System.out.println(c.color);
		Animalll a=new cat();
		System.out.println(a.color);
		
	}

}
