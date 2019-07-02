import java.util.Comparator;

public class CustomStringComparator implements Comparator<String> {	
	@Override
	public int compare(String c1, String c2) {
		if(c1.length()>c2.length()) {
			return 1;
			} else if(c1.length()<c2.length()) {
				return -1;
			}
			return 0;
	}
}
