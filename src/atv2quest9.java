import javax.swing.JOptionPane;

public class atv2quest9 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

        if((numero % 3) == 0 && (numero % 5) == 0) {
            System.out.println("Divisivel por 3 e por 5 simultaneamente");
        } else if((numero % 3) == 0) {
            System.out.println("Divisivel por 3 e não divisivel por 5");
        } else if((numero % 5) == 0) {
            System.out.println("Não divisivel por 3 e divisivel por 5");
        } else {
            System.out.println(("Não divisivel por 3 e não divisivel por 5"));
        }
    }
}
