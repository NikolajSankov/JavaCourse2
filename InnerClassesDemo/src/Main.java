import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String c1, String c2) {
				if(c1.length()>c2.length()) {
					return 1;
				} else if(c1.length()<c2.length()) {
					return -1;
				}
				return 0;
 			}
		};
		
		String []  strings = {"1", "22", "55555", "4444", "333"};
		
		Arrays.sort(strings, c);
		
		for(String c1: strings) {
			System.out.println(c1);
		}
		String someText = "some Text";
		Person p= new Person() {
			@Override
			public void sayHello() {
				System.out.println(someText);	
				}
		};
		p.sayHello();
		
		InnerClassDemo.StringByLengthComparator sc = new InnerClassDemo.StringByLengthComparator();
		
	}
}
