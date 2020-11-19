import java.util.Random;

public class atv5quest6 {
    public static void main(String[] args) {
        int valores[] = new int[10];
        Random randomNumber = new Random();
        int quantPar = 0, quantImpar = 0;

        for (int i = 0; i < 10; i++) {
            valores[i] = randomNumber.nextInt();
            if(valores[i] % 2 == 0) {
                quantPar++;
            } else {
                quantImpar++;
            }
        }

        System.out.print("\nQuantidade de pares: ");
        System.out.println(quantPar);
        System.out.print("Quantidade de impares: ");
        System.out.println(quantImpar);
    }
}
