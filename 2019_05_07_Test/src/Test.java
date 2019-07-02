
public class Test {

	public static void main(String[] args) {
		
		String string = "Ivan";
		String string3 = "Ivan";
		String string2 = new String("Ivan");
		
		System.out.println(string == string3);
		
		System.out.println(string.equals(string2));
		
		String helloWorld = "Hello ";
		helloWorld = helloWorld +"World";
		System.out.println(helloWorld);
		
		StringBuilder sb = new StringBuilder("Test");
		sb.append("a");
		System.out.println(sb);
		
		String testString = transform("a0bb00cde");
		System.out.println(testString);

	}
	
	public static String transform(String input) {
		String zeros = "";
		String others = "";
		for (int i = 0; i < input.length(); i++) {
			//zeros.append(input.charAt(i));
			System.out.println(input.charAt(i));
		}
		return zeros.append(others).toString(); 
	}
	
	//"abcde", "eabcd" -> true
	
	public static boolean isCircular(String s1, String s2) {
		return false;
	}
}





