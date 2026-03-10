import java.util.*;

public class CountingValleys {
    public static int countingValleys(String s) {
        int level = 0, valleys = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') {
                level++;
                if (level == 0) valleys++;
            } else {
                level--;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(countingValleys(s));
    }
}