import javax.swing.JOptionPane;

public class atv2quest1 {
    public static void main(String[] args) {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor numérico").replace(",", "."));
        float div = valor % 2;

        if(div == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é impar");
        }
    }
}