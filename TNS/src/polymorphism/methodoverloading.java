package polymorphism;
class Adder{
	int add(int a,int b) {
		return a+b;
		
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a,float b) {
	return a+b;
}
}

public class methodoverloading {
	public static void main(String[]args) {
		Adder a=new Adder();
		a.add(5,6);
	}

}
