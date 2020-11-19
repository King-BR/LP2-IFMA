import javax.swing.JOptionPane;

public class atv3quest6 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para calcular o fatorial"));
        int f = x;

        if(x == 0) {
            System.out.println(1);
            return;
        }

        while (x > 1){
            f = f * (x-1);
            x--;
        }
        System.out.println(f);
    }
}
