import java.util.Scanner;

public class atv7quest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de linhas da matriz: ");
        int X = sc.nextInt();
        System.out.print("Digite o numero de colunas da matriz: ");
        int Y = sc.nextInt();

        if(X != Y) {
            System.out.println("\nA matriz não é quadrada então não pode ser um quadrado magico");
            return;
        }

        System.out.print("\n");

        int matriz[][] = new int[X][Y];
        int somaDiagonal1 = 0, somaDiagonal2 = 0;
        int tempLinha = 0, tempColuna = 0;

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < X; i++) {
            int somaLinha = 0, somaColuna = 0;
            for (int j = 0; j < Y; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];

                if(i == j) {
                    somaDiagonal1 += matriz[i][j];
                }

                if (i + j == X - 1) {
                    somaDiagonal2 += matriz[i][j];
                }
            }
            //System.out.printf("\nlinha %d: %d\ncoluna %d: %d", i, somaLinha, i, somaColuna);

            if(i == 0) {
                tempLinha = somaLinha;
                tempColuna = somaColuna;
            } else {
                if(tempLinha != somaLinha) {
                    System.out.println("\nA matriz não é um quadrado magico");
                    return;
                }

                if(tempColuna != somaColuna) {
                    System.out.println("\nA matriz não é um quadrado magico");
                    return;
                }
            }
        }
        //System.out.printf("\nDiagonal 1: %d\nDiagonal 2: %d", somaDiagonal1, somaDiagonal2);
        System.out.println("\nA matriz é um quadrado magico");
    }
}
