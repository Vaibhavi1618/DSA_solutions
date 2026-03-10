import java.util.*;

public class SecondSmallestLargest {
    public static void findSecondSmallestAndLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Second Smallest : " + arr[1]);
        System.out.println("Second Largest : " + arr[arr.length - 2]);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        findSecondSmallestAndLargest(arr);
    }
}