package blockkeyword;

public class block {
	static {
		System.out.println("static block");
	}
	public static void main(String[]args) {
		System.out.println("main method");
	}

}
class outer{
	static int i=5;
	static class inner{
		void dispaly() {
			System.out.println("dispaly method in inner class");
		}
	}
	public class nestedclass{
		public static void main(String[]args) {
			outer o=new outer();
			o.i;
			System.out.println(o,i);
			o.display();
			outer.inner i=new outer.inner();
			i.display();
		}
		
		
	}
}
