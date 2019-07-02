import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeventhTaskList {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 24, 3, 6);
		
		System.out.println(allNumsLessThan(list, 6));
	}
	
	public static List<Integer> allNumsLessThan(List<Integer> list, int num) {
		List<Integer> finalList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)<=num) {
				finalList.add(list.get(i));
			}
		}
		return finalList;
	}
	
}
