import javax.swing.JOptionPane;

public class atv3quest8 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        int controle = 0;

        for (int i = 0;; i++){
            if(i % 2 != 0) {
                controle++;
                System.out.println(i);
            }

            if(controle == num) break;
        }
    }
}
