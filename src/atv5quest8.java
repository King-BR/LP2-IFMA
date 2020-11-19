import javax.swing.*;

public class atv5quest8 {
    public static void main(String[] args) {
        int valores[] = { 18, 2, -1, 33, 61, 9, -32, 16, -15, 9 };
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        int quant = 0;

        for (int i = 0; i < 10; i++) {
            if(valores[i] == valor) {
                quant++;
            }
        }

        System.out.print("\nQuantidade de vezes que aparece no array: ");
        System.out.println(quant);
    }
}
