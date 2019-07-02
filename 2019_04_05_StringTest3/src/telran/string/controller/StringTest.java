package telran.string.controller;

public class StringTest {
	
	public static void main(String[] args) {
		char c = '5';
		boolean check=false;
		if(Character.isDigit(c)) {
			check=true;
		}
		System.out.println(check);
		
		String str = new String("Hello");
		char [] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
		String str1 = new String(chars);
		System.out.println(str1);
		str=str+str1;
		System.out.println(str);
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		String str2 = " WORLWD";
		
		System.out.println(str2.equals(str1));
		System.out.println(str2.equalsIgnoreCase(str1));
		
		System.out.println(str2.indexOf("LD"));
		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.lastIndexOf('W'));
		
		String str3=str.replace("H", "My");
		System.out.println(str3);
		
		
		
		
		
	}
}
