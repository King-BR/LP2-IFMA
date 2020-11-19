public class atv6quest1 {
    public static void main(String[] args) {
        int A[][] = {{1, 4, 1}, {-3, 2, 0}, {3, 5, 2}};
        int B[][] = {{2, 8, 1}, {-1, 1, 0}, {5, 1, -2}};
        int X[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                X[i][j] = A[i][j] + B[i][j];
                System.out.printf("%d ", X[i][j]);
            }
        }
    }
}
