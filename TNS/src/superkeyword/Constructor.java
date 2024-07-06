package superkeyword;
class Animall{
	Animall(){
		System.out.println("Animal constructor");
	}
}
class dogg extends Animall{
	dogg(){
		super();
		System.out.println("dogg constructor");
	}
}
public class Constructor {
	public static void main(String[]args) {
		dogg d=new dogg();
	}

}
