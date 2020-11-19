import java.util.Scanner;

public class atv7quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas da matriz: ");
        int X = sc.nextInt();
        System.out.print("Digite o numero de colunas da matriz: ");
        int Y = sc.nextInt();

        int M[][] = new int[X][Y];
        int N[][] = new int[X][Y];

        System.out.print("\n");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna: ", i + 1, j + 1);
                M[i][j] = sc.nextInt();

                if(M[i][j] % 2 == 0) {
                    N[i][j] = M[i][j] * M[i][j];
                } else {
                    N[i][j] = M[i][j] * M[i][j] * M[i][j];
                }
            }
        }

        for (int i = 0; i < X; i++) {
            System.out.print("\n");
            for (int j = 0; j < Y; j++) {
                System.out.printf("%d ", N[i][j]);
            }
        }
    }
}
