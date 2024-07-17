package setinterface;
import java.util.LinkedHashSet;//ordered set if unorderd use hashset
import java.util.Set;
public class main {
	public static void main(String []args) {
		Set s=new LinkedHashSet();
		s.add(1);
		s.add(2.0f);
		s.add(3.58d);
		s.add("hello");
		s.add('c');
		System.out.println("the values stored in s"+s);
		
		Set s1=new LinkedHashSet();
		s1.add(1);
		s1.add(20.0f);
		s1.add(30.58d);
		s1.add("helloworld");
		s1.add('h');
		System.out.println("the values stored in s1"+s);
		
		//intersection
		//s.retainAll(s1);// compares 2 i/p and keep common things
		//System.out.println("the values stored in s1 after intersection"+s1);
		//union
		//s.addAll(s1);
		//System.out.println("the values stored in s after intersection"+s);
		//System.out.println("the values stored in s1 after intersection"+s1);
		
		//diffeence
		s.removeAll(s1);//keeps all the different values
		System.out.println("the values stored in s after intersection"+s);
		System.out.println("the values stored in s1 after intersection"+s1);
		
	}

}
