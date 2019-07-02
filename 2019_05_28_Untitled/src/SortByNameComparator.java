import java.util.Comparator;
public class SortByNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o, Person t1) {
		return o.name.compareTo(t1.name);
	}
	
	
	
}
