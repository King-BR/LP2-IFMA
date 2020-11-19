import javax.swing.JOptionPane;

public class atv2quest3 {
    public static void main(String[] args) {
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor numérico").replace(",", "."));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor numérico").replace(",", "."));

        if(valor1 == valor2) {
            float cubo = valor1 * valor1 * valor1;

            System.out.println("O cubo do valor fornecido é: " + cubo);
        } else {
            float quad1 = valor1 * valor1;
            float quad2 = valor2 * valor2;

            System.out.println("O quadrado do primeiro valor é: " + quad1);
            System.out.println("O quadrado do segundo valor é: " + quad2);
        }
    }
}
