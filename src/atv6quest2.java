import java.util.Scanner;

public class atv6quest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int X = sc.nextInt();

        System.out.println("Digite o numero de colunas");
        int Y = sc.nextInt();

        System.out.print("\n");

        if(X <= 0 || Y <= 0) {
            System.out.println("Tamanho invalido");
            return;
        } else if(X != Y) {
            System.out.println("A matriz não é simetrica");
            return;
        }

        int matriz[][] = new int[X][Y];
        int transposta[][] = new int[Y][X];

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna:\n", i + 1, j + 1);
                int num = sc.nextInt();
                matriz[i][j] = num;
                transposta[j][i] = num;
            }
        }

        int test = 1;

        for (int k = 0; k < X; k++) {
            for (int l = 0; l < Y; l++) {
                if(matriz[k][l] != transposta[k][l]) {
                    test = 0;
                }
            }
        }

        if(test == 1) {
            System.out.println("\nA matriz é simetrica");
        } else {
            System.out.println("\nA matriz não é simetrica");
        }
    }
}
