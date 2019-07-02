package demo;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println(transform("ab0cd00"));
	}
	
	//ab0cd00 -> 00abc
	public static String transform(String input) {
		StringBuilder zeros = new StringBuilder();
		StringBuilder others = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '0') {
				zeros.append(input.charAt(i));
			}
			else {
				others.append(input.charAt(i));
			}
		}
		return zeros.append(others).toString();
	}
}
