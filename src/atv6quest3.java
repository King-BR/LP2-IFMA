import java.util.Scanner;

public class atv6quest3 {
    public static void main(String[] args) {
        // Para facilitar testes
        int tam = 4;

        int M1[][] = new int[tam][tam];
        int M2[][] = new int[tam][tam];
        int produto[][] = new int[tam][tam];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna da matriz 1:\n", i + 1, j + 1);
                M1[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna da matriz 2:\n", i + 1, j + 1);
                M2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                for (int k = 0; k < tam; k++) {
                    produto[i][j] += (M1[i][k] * M2[k][j]);
                }
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.println("\n");
            for (int j = 0; j < tam; j++) {
                System.out.printf("%d ", produto[i][j]);
            }
        }
    }
}
