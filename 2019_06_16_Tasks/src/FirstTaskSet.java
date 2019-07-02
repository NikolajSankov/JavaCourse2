import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstTaskSet {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add("Maria");
		list.add("Piotr");
		list.add("Maria");
		
		System.out.println(removeDuplicates(list));
		
	}
	
	public static List<String> removeDuplicates(List<String> input) {
		Set<String> set = new HashSet<>(input);
		List<String> finalList = new ArrayList<>(set);
		return finalList;
	}
	
}
