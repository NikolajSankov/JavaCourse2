import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixthtaskList {
	
	public static void main(String[] args) {
		List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listTwo = Arrays.asList(6, 7, 8, 9, 10);
		
		List<Integer> newList = new ArrayList<>();
		newList.addAll(listOne);
		newList.addAll(listTwo);
		
		System.out.println(newList);
		
 	}
	
}
