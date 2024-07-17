package setinterface;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
public class demo {
	public static void main(String []args) {
		SortedSet t=new TreeSet();
		t.add(10);
		t.add(20.0f);
		t.add(3.567d);
		//t.add("hello");
		//t.add('c');
		System.out.println(t);
		List l=new ArrayList();
		l.add(10);
		l.add(20.0f);
		l.add(3.567d);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
