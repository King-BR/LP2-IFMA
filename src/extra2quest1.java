import javax.swing.JOptionPane;

public class extra2quest1 {
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero inteiro"));

        if (valor1 < valor2 && valor2 < valor3) {
            System.out.println(valor1 + ", " + valor2 + ", " + valor3);
        } else if (valor1 < valor3 && valor3 < valor2) {
            System.out.println(valor1 + ", " + valor3 + ", " + valor2);
        } else if (valor2 < valor1 && valor1 < valor3) {
            System.out.println(valor2 + ", " + valor1 + ", " + valor3);
        } else if (valor2 <valor3 &&valor3 < valor1) {
            System.out.println(valor2 + ", " + valor3 + ", " + valor1);
        } else if (valor3< valor1 && valor1 < valor2) {
            System.out.println(valor3+ ", " + valor1 + ", " + valor2);
        } else if (valor3< valor2 && valor2 < valor1) {
            System.out.println(valor3+ ", " + valor2 + ", " + valor1);
        }
    }
}
