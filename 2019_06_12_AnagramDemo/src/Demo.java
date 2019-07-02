import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	
	private static Map<String, List<String>> voc = new HashMap<>();
	
	public static List<String> list = Arrays.asList("ivan", 
			"navi",
			"vani", 
			"anna",
			"naan");
	
	public static List<String> isAnagram(String word) {
		String s = sortWord(word);
		return voc.get(s);
	}
	
	public static void createVoc() {
		for(String s: list) {
			
		}
	}
	public static String sortWord(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	public static void main(String[] args) {
		createVoc();
		
		List<String> ivan = isAnagram("Ivan");
		List<String> anna = isAnagram("anna");
	}
	
}
