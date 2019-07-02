import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
        String [] words = {"ivan", "maria", "ivan", "ivan", "maria", "anna"};

        System.out.println(countWords(words));
    }

    public static Map<String, Integer> countWords(String [] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: words) {
            if(!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s)+1);
            }
        }

        return map;
    }
}