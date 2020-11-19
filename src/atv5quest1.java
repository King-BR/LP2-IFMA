import javax.swing.JOptionPane;

public class atv5quest1 {
    public static void main(String[] args) {
        int valores[] = new int[6];

        for(int i = 0; i <= 5; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }

        for(int i = 5; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
