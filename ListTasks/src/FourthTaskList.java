import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourthTaskList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		List<String> list1 = new ArrayList<>();
		list1.add("cc");
		list1.add("dd");
		list1.add("aa");
		list1.add("bb");
		
		System.out.println(isCircular(list, list1));
		
		// abcd      dabc    cdab   
		
	}
	
	public static boolean isCircular(List<String> list, List<String> list1) {
		if(list.size() != list1.size()) return false;
		List<String> tmp = list;
		for (int i = 0; i < list.size(); i++) {
			Collections.rotate(tmp, 1);
			if(tmp.equals(list1)) {
				return true;
			}
		}
		return false;
			
		}
}
