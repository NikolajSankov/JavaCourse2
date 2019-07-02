import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomColllectorDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person("Ivan", 15, null);
		Person p2 = new Person("Piotr", 10, null);
		Person p3 = new Person("Maria", 18, null);
		Person p4 = new Person("Elena", 26, null);
		
		Supplier<Box> supp = () -> {
			System.out.println("Supplying starting value");
			return new Box(0);
		};
		
		BiConsumer<Box, Person> accumulator = (result, person) -> {
			System.out.println(result.getAmount() + " " + person);
			result.setAmount(result.getAmount() + person.getAge());
		};
		
		BinaryOperator<Box> combiner = (res1, res2) -> {
			System.out.println("Combining results");
			res1.setAmount(res1.getAmount() + res2.getAmount());
			return res1;
		};
		
		Collector<Person, Box, Boolean> collector = Collector.of(
				supp, 
				accumulator, 
				combiner,
				b -> b.getAmount() > 50
				);
		Boolean result = Stream.of(p1, p2, p3, p4)
				.collect(collector);
		
		//Box box = Stream.of(p1, p2, p3, p4) 
				//.parallel()
				//.collect(collector);
		
		System.out.println("total age in the box "+result);
	}
}
