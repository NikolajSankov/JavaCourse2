import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ivan", "Maria", "Stephan", "Amalia", "John");
		
		//System.out.println(filterNames(list));
		
				
		List<String> strings = filterNames(list);
		
		System.out.println(strings);
				
		}
	
	public static List<String> filterNames(List<String> list) {
		List<String> tmp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length() != 4) {
				tmp.add(list.get(i));
			}
		}
		return tmp;
	}
	
}
