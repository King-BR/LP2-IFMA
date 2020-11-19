import javax.swing.JOptionPane;

public class atv3quest3 {
    public static void main(String[] args) {
        double inicio = Double.parseDouble(JOptionPane.showInputDialog("Informe o começo do intervalo").replace(",", "."));
        double fim = Double.parseDouble(JOptionPane.showInputDialog("Informe o final do intervalo").replace(",", "."));

        for (int i = (int) Math.ceil(inicio); i <= fim; i++) {
            if(i >= 0) {
                System.out.println(i);
            }
        }
    }
}
