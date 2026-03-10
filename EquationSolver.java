import java.util.*;

public class EquationSolver {
    public static long solveEquation(int a, int b, int c) {
        // The equation is a³ + a²b + 2a²b + 2ab² + ab² + b³ = (a+b)^3
        return (long) Math.pow(a + b, 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); // c is not used in the equation
        System.out.println(solveEquation(a, b, c));
    }
}