import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondTaskSet {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
		System.out.println(findDuplicates(list));
		
	}
	
	public static Set<String> findDuplicates(List<String> listContainingDuplicates) { 
	  Set<String> setToReturn = new HashSet<>(); 
	  Set<String> set1 = new HashSet<>();

	  for (String str : listContainingDuplicates) {
	   if (!set1.add(str)) {
	    setToReturn.add(str);
	   }
	  }
	  return setToReturn;
	}
	
}
