import java.util.*;

public class MinimumDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] items = new String[n];
        int[] discounts = new int[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);
            int discount = (price * discountPercent) / 100;
            items[i] = name;
            discounts[i] = discount;
        }
        int minDiscount = Integer.MAX_VALUE;
        String minItem = "";
        for (int i = 0; i < n; i++) {
            if (discounts[i] < minDiscount) {
                minDiscount = discounts[i];
                minItem = items[i];
            }
        }
        System.out.println(minItem);
    }
}