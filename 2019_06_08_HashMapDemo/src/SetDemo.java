import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
TreeSet<String> set = new TreeSet<>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String s = iterator.next();
			if(s.equals("bbb")) {
				iterator.remove();
			}
		}
		System.out.println(set);
	}
	
	
	
	
}
