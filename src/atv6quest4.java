import java.util.Scanner;

public class atv6quest4 {
    public static void main(String[] args) {
        int tam = 2;
        int test = 1;
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna:\n", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                for (int k = 0; k < tam; k++) {
                    for (int l = 0; l < tam; l++) {
                        if(matriz[i][j] == matriz[k][l]) {
                            if (i != k || j != l) {
                                if(test == 1) {
                                    System.out.println("\nNumeros repetidos:");
                                }
                                test = 0;
                                System.out.println(matriz[k][l]);
                            }
                        }
                    }
                }
            }
        }

        if(test == 1) {
            System.out.println("\nNenhum numero repetido");
        }
    }
}
