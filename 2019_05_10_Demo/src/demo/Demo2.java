package demo;

public class Demo2 {
	
	
	
	public static void main(String[] args) {
		System.out.println(transform("ab0cd00"));
		
		System.out.println(isCircular("abcd","dbca" ));
	}
	
	//ab0cd00 -> 00abc
	public static String transform(String input) {
		String zeros = "";
		String others = "";
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '0') {
				zeros = zeros + input.charAt(i);
			}
			else {
				others = others + input.charAt(i);
			}
		}
		return zeros + others;
	}
	
	public static boolean isCircular(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		String tmp = s1;
		for (int i = 0; i < s1.length(); i++) {
			tmp = tmp.charAt(tmp.length()-1) + tmp.substring(0, tmp.length()-1);
			if(tmp.equals(s2)) {
				return true;
			}
		}
		return false;
			
		}
	
	//abbbbccdeebb -> 4
	//a -> 2
	//abb -> 2
	//public static int getLongestSubstring(String input) {
	//	
	//}
		
	}
	

