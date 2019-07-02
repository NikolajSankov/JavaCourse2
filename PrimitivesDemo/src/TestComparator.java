import java.util.Comparator;

public class TestComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer first, Integer second) {
		return first < second? -1 : (first.equals(second)) ? 0:1;
	}
	
	
	
	
}
