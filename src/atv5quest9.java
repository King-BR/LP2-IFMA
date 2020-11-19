public class atv5quest9 {
    public static void main(String[] args) {
        int A[] = { 18, 2, -1, 3, 61, 19, -32, 16, -15, 9 };
        int B[] = { 19, 25, 3, 5, 60, 9, 52, 36, 5, 2 };

        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(A[i] == B[j]) {
                    System.out.println(A[i]);

                    // para não contar numeros repetidos
                    A[i] = -999999999;
                }
            }
        }
    }
}
