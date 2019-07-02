
public class StringTest {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=new String("Hello");
		
		boolean res = str1==str2;
		System.out.println(res);
		
		String str3  = new String("Hello");
		
		boolean res1= str2==str3;
		System.out.println(res1);
		
		boolean res2= str1.equals(str2);
		System.out.println(res2);
		
		boolean res3=str2.equals(str3);
		System.out.println(res3);
		
		String str4="Hello World";
		String str5="hello world";
		
		boolean res4=str4.equalsIgnoreCase(str5);
		boolean res5=str4.equals(str5);
		System.out.println(res4);
		System.out.println(res5);
		String str6=str5.toUpperCase();
		System.out.println(str6);
		String str7=str6.toLowerCase();
		System.out.println(str7);
		
	}

}
