package mapinterface;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class demo {
	public static void main(String []args) {
		Map m=new TreeMap();
		m.put(557, "hiiji");
		m.put(558, "hiii");
		m.put(577, "hii");// if duplicated key value recent valve is taken
		m.put(879,null);
		System.out.println(m);
		
	}
}
