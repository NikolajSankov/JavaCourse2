import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
        String [] words = {"aa", "bbb", "cc", "ddd", "abcde"};

        
        System.out.println(getMap(words));
    }
	
    public static Map<Integer, List<String>> getMap(String [] words) {
        Map<Integer, List<String>> map = new HashMap<>();
        for(String s:words) {
            int length = s.length();
            if(!map.containsKey(length)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(length, list);
            } else {
                List<String> list = map.get(length);
                list.add(s);
            }
        }
        return map;
    }
}
