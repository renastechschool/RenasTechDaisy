package students.Yasemin;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Labs04 {
    public static void main(String[] args) {

            String s = "AAABBCDD";

            Map<Character, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                freqMap.merge(c, 1, (a, b) -> a + b);
            }
            freqMap.forEach((k, v) -> System.out.println(k + " and " + v));
        }


}
