public class atv7quest1 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                if(i == j ) {
                    System.out.print("0 ");
                } else {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }
    }
}
