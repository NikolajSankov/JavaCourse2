import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		
		
		Consumer<String> printable = System.out::println;
		printable.accept("Hello World");
		
		Consumer<String> printable2 = str -> {
			System.out.println(str);
		};
		printable2.accept("Hello World!");
		
		PrintableI pi = System.out::println;
		pi.print("Hello World Consumer");
		
		Consumer<String> printer = getPrinter();
		printer.accept("abdcdss");
		
		printSomething(System.out::println);
		printSomething(getPrinter());
		printSomething(str -> System.out.println(str));
		
		int maxsSalary = Employee.getMaxSalary();
		
		//Method reference to static method
		Supplier<Integer> getMaxSalary = Employee::getMaxSalary;
		
		Employee mike = new Employee("Mike", 3500);
		
		//method reference to non static method with no instance
		
		Function<Employee, Integer> getSalary = Employee::getSalary;
		System.out.println("mikes salary is "+ getSalary.apply(mike));
		
		//method reference to non static method with instance
		Supplier<Integer> getMikesSalary = mike::getSalary;
		System.out.println("mikes salary is "+getMikesSalary.get());
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> collect = list.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer>  integers = list.stream().filter(i -> i>3).collect(Collectors.toList());
		System.out.println(integers);
		
		//List<Employee> employees = Arrays.asList(e, mike);
		//List<String> employeeNames = employees
			//	.stream() 
			//	.map(Employee::getName)
			//	.collect(Collectors.toList());
		
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
		//integerStream.reduce(0, (a1, b1) -> a1 + b1>)
		
}
	
	public static Consumer<String> getPrinter () {
		return System.out::println;
	}
	
	public static void printSomething(Consumer<String> c) {
		c.accept("svhbs");
	}
}
