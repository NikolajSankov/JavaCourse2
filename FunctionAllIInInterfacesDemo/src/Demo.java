import java.util.Arrays;
import java.util.Comparator;

public class Demo {
	
	public static void main(String[] args) {
		String [] strings = {"a", "bbb","cccc", "dddddd", "eeeeeee" };
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		
		};
				Arrays.sort(strings, c);
		
	}
	
}
