import javax.swing.JOptionPane;

public class atv3quest4 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

            if(num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.printf("Quantidade de numeros par: %d\nQuantidade de numeros impar: %d\n", par, impar);
    }
}
