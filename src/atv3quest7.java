import javax.swing.JOptionPane;

public class atv3quest7 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        int soma = 0;

        do {
            if(num < 0) {
                soma += num;
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

        } while (num != 0);

        System.out.println(soma);
    }
}
