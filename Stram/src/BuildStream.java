import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuildStream {

	public static void main(String[] args) {
		
		Stream<String> streamOfValues = Stream.of("a1", "b2", "c3");
		
		streamOfValues.forEach(System.out::println);
		
		String[] array = {"a1", "b2", "c3"};
		Stream<String> streamOfArray = Arrays.stream(array);
		System.out.println(streamOfArray.collect(Collectors.toList()));
		
		Collection<String> stringList = Arrays.asList("a1", "b2", "c3");
		Stream<String> streamOfCollection = stringList.stream();
		
		Optional<String> max = streamOfCollection.peek(System.out::println).max(String::compareTo);
		
		if(max.isPresent())
		{
			System.out.println(max.get());
			}
		}
}
