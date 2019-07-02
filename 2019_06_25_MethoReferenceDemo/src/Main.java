import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Adress a1 = new Adress("mira", 12);
		
		Adress a2 = new Adress("dvm", 234);
		
		Person p1 = new Person("Ivan", 15, null);
		Person p2 = new Person("Piotr", 25, null);
		
		List<Person> person = Arrays.asList(p1, p2);
		
		//List<Adress> collect = person
				//.stream()
				//.filter(p -> p.age > 17);
				//.map(Person::getAdress)
				//.collect(Collectors.toList());
		//System.out.println(collect);
		
		Stream<String> ivan = Stream.of("Ivan", "Piotr", "Ivan");
		Set<String> collect1 = ivan.collect(Collectors.toSet());
		System.out.println(collect1);
		
		Stream<String> ivan1 = Stream.of("Ivan", 
				"Piotr",
				"Elena",
				"Anna",
				"Maria",
				"Ian");
		Map<Integer, List<String>> listMap = ivan1.collect(Collectors.groupingBy(String::length));
		
		listMap.forEach((k, v) -> {
			System.out.println(k +"->"+ v);
		});
		
		Map<Integer, String> collect2 = person
				.stream()
				.collect(Collectors.toMap(Person::getAge, Person::getName));
		System.out.println(collect2);
		
		BankAccount b1 = new BankAccount("DE2324", p1);
		BankAccount b2 = new BankAccount("DE54334", p2);
		
		Stream<BankAccount> b11 =   Stream.of(b1, b2);
		
		List<BankAccount> collect3 = 
		b11.map(b -> new BankAccount(alianate(b.getIBANN()), b.getOwner()))
		.collect(Collectors.toList());
		System.out.println(collect3);
		
		
	}
	public static String alianate(String input) {
		return "******";
	}
	
}
