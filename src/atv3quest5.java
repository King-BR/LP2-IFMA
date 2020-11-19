import javax.swing.JOptionPane;

public class atv3quest5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro positivo"));

        if(num < 0) {
            System.out.println("Numero tem que ser positivo");
            return;
        }

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
