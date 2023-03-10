package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyCharacter {
    public static void main(String[] args) {

        String s = "roop";
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
            // System.out.println(e.getValue());
        }
        // System.out.println(map);
    }
}
