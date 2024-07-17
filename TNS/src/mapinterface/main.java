package mapinterface;
import java.util.HashMap;//unorderd
import java.util.Map;
public class main {
	public static void main(String []args) {
		HashMap m=new HashMap();
		m.put(557, "hiiji");
		m.put(558, "hiii");
		m.put(577, "hii");// if duplicated key value recent valve is taken
		m.put(879,null);
		System.out.println(m);
	}

}
