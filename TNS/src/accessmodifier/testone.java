package accessmodifier;

public class testone {
	public int i;
	public void display() {
		System.out.println("access mod eg");
		
	}
	public static void main(String[]args) {
		testone t1=new testone();
	
		t1.i=5;
		System.out.println(t1.i);
		t1.display();

}
}