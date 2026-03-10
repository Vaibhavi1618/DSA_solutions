import java.util.*;

public class MaximumMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int semesters = sc.nextInt();
        int[] subjects = new int[semesters];
        for (int i = 0; i < semesters; i++) {
            System.out.print("Enter no of subjects in " + (i+1) + " semester: ");
            subjects[i] = sc.nextInt();
        }
        for (int i = 0; i < semesters; i++) {
            System.out.print("Marks obtained in semester " + (i+1) + ": ");
            int max = 0;
            for (int j = 0; j < subjects[i]; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
                if (mark > max) max = mark;
            }
            System.out.println("Maximum mark in " + (i+1) + " semester: " + max);
        }
    }
}