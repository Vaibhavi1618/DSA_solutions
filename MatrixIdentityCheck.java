
public class MatrixIdentityCheck {
    public static boolean areMatricesIdentical(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) return false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] A = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int[][] B = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        System.out.println(areMatricesIdentical(A, B) ? "Matrices are identical" : "Matrices are not identical");
    }
}