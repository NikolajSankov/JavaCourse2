import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Ivan", 15);
		Person p2 = new Person("Piotr", 10);
		Person p3 = new Person("Maria", 25);
		Person p4 = new Person("Elena", 6);
		
		Person [] persons= {p1, p2, p3, p4};
		
		System.out.println(p1.compareTo(p2));
		
		Arrays.sort(persons, new SortByNameComparator());
		
		for(Person p: persons) {
			System.out.println(p);
		}
		
	}
	public Person getOldest(Person p1, Person p2) {
		if(p1.age > p2.age) {
			return p1;
		}else {
			return p2;
		}
	}
}
