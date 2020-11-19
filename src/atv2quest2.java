import javax.swing.JOptionPane;

public class atv2quest2 {
    public static void main(String[] args) {
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor numérico inteiro"));
            int multi = valor * 2;
            
            if(multi > 30) {
                System.out.println("O resultado é: " + multi);
            } else {
                System.out.println("O resultado é menor ou igual a 30");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor fornecido não é inteiro","Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}