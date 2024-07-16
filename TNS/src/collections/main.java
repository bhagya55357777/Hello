package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;//doubles the memory storage but time consuming doesnt allow iteraters
import java.util.HashSet;
import java.util.Set;//its stored in unordered but printing i s ordered 
public class main {
	public static void main (String[]args) {
		//List a=new ArrayList();
		//List a=new LinkedList();
		//List a=new Vector();
		Set a= new HashSet();
		a.add(10);
		a.add(20.6f);
		a.add(30.78d);
		a.add("hello");
		a.add('c');
		System.out.println(a);
	}

}
