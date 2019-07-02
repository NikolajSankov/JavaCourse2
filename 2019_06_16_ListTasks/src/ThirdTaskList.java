import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdTaskList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 200);
		List<Integer> list1 = Arrays.asList(5, 2, 3, 200);
		
		System.out.println(proofIfNumsInListEqual(list,list1));
	}
	
	public static List<Boolean> proofIfNumsInListEqual(List<Integer> list, List<Integer> list1) {
		List<Boolean> resList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)==list1.get(i)) {
				resList.add(true);
			} else {
				resList.add(false);
			}
		}
		return resList;
		
	}
}
