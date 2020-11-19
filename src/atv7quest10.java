import java.util.Scanner;

public class atv7quest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas da matriz: ");
        int X = sc.nextInt();
        System.out.print("Digite o numero de colunas da matriz: ");
        int Y = sc.nextInt();

        System.out.print("\n");

        int matriz[][] = new int[X][Y];
        int linhaNula = 0, colunaNula = 0;
        int tempLinha = 1, tempColuna = 1;

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.printf("Digite o valor da %d° linha %d° coluna: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if(matriz[i][j] != 0 ) {
                    tempLinha = 0;
                }

                if(matriz[j][i] != 0) {
                    tempColuna = 0;
                }
            }

            if(tempLinha == 1) {
                linhaNula++;
            }
            tempLinha = 1;

            if(tempColuna == 1) {
                colunaNula++;
            }
            tempColuna = 1;
        }

        System.out.printf("\nQuantidade de linhas nulas: %d\nQuantidade de colunas nulas: %d\n", linhaNula, colunaNula);
    }
}
