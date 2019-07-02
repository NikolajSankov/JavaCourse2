import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list = getList ("Ivan", "Piotr");
		
		System.out.println(list);
		
		String s = list.get(1);
		
		System.out.println(s);
		
		List emptyList = Collections.EMPTY_LIST;
		
		
}
	
	public static List<String> getList(String s1, String s2) {
		List<String> list = new LinkedList<>();

		list.add(s1);
		list.add(s2);
		return list;
	}
	
	
	
}
