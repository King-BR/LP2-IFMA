import javax.swing.*;

public class atv3quest9 {
    public static void main(String[] args) {
        int quantPares = 0, quantLidos = 0;
        double maior = 0, menor = 0, somaPares = 0, somaTotal = 0, media;

        for(;;) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero").replace(",", "."));

            if(num == 0) {
                break;
            }

            somaTotal += num;
            quantLidos++;

            if(num % 2 == 0) {
                somaPares += num;
                quantPares++;
            }

            if(num < menor || menor == 0) menor = num;
            if(num > maior) maior = num;

        }

        media = somaTotal / quantLidos;

        System.out.printf("Quantidade de numeros lidos: %d\nQuantidade de numeros pares: %d\nSoma dos numeros pares: %.2f\nMedia: %.2f\nMaior: %.2f\nMenor: %.2f\n", quantLidos, quantPares, somaPares, media, maior, menor);
    }
}
