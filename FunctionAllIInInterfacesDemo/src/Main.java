import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.xml.crypto.dsig.Transform;

public class Main {
	
	public static void main(String[] args) {
		Comparator<String> cl2 = (a, b) -> Integer.compare(a.length(), b.length());
		
		StringConcate concat1 = (a, b) -> String.valueOf(a)+String.valueOf(b);
		System.out.println(concat1.concat(10, 5));
		
		Checkable check23 = (in) -> in.length()==3;
		System.out.println(check23.check("abcdc"));
		
		Checkable check1234 = (in) -> in.length()%2==0 ? true:false;
		System.out.println(check1234.check("123"));
		
		Transformable modify1 = (in1) -> in1.toUpperCase();
		System.out.println(modify1.modify("abCde"));
		
		NumberSummable ns = (a, b) -> a + b;
		System.out.println(ns.sum(2, 4));
		
		Transformable tr = (in) -> in.length()==4 ? in="****" : in;
		System.out.println(tr.modify("kddf"));
		
		Producable pro = (s) -> s;
		System.out.println(pro.produce("Hello World"));
		
		Printable print123 = (s) -> System.out.println(("!"+s+"!"));
		print123.print("Hello");
		
		//Predicate<String> p  = (s) -> s.length() ==3;
		//Predicate<String> p2  = (s) -> s.length() ==3 ? true:false;
		//Function<String, String> f = (s) -> s.toUpperCase();
		
		//Predicate<String> ds = 
		//Consumer<String> c = System.out::println;
		
		//print12(c, "Hello World");
		
	} 
	
	
	
	//public static void print12(Consumer<String> c, String text) {
		//c.accept(text);
	//}
	
	
}