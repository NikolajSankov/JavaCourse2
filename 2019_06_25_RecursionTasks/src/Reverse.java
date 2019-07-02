public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse("abcd"));
	}
	
	public static String reverse(String str) {
		if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
}
