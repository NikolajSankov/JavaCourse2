
public class Test123 {

	public static void main(String[] args) {
		printsmth("hallo");
		int result = add(5, 5);
		
		System.out.println(result);
		
		Person person = new Person("Nikolaj", "Sankov", 12);
		Person person1 = new Person("Alexej", "Sankov", 16);
		
		String str = person.getFirstName();
		System.out.println(str);
		
		person1.setFirstName("King");
		System.out.println(person1.getFirstName());
		
		System.out.println(person.toString());
		
	}
	
	public static void printsmth(String word) {
		System.out.println("Print something "+word);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	
	
}
