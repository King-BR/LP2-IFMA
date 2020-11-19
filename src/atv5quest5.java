import javax.swing.JOptionPane;

public class atv5quest5 {
    public static void main(String[] args) {
        int valores[] = new int[10];

        for (int i = 0; i < 10; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            if(valores[i] < 0) {
                valores[i] = -1;
            }
        }

        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i]);
        }
    }
}
