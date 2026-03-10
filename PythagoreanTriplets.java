
public class PythagoreanTriplets {
    public static void generatePythagoreanTriplets(int limit) {
        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c < limit && c * c == a * a + b * b) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
    public static void main(String[] args) {
        int limit = 20;
        generatePythagoreanTriplets(limit);
    }
}