public class atv7quest8 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i + j == 2) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println(soma);
    }
}
