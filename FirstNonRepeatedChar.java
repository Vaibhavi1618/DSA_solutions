import java.util.*;

public class FirstNonRepeatedChar {
    public static char firstNonRepeatingChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(firstNonRepeatingChar(s));
    }
}