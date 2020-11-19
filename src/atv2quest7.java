import javax.swing.JOptionPane;

public class atv2quest7 {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a senha");

        if(senha.length() != 5) {
            JOptionPane.showMessageDialog(null, "Senha de tamanho incorreto\nTamanho obrigatorio: 5","Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(senha.equals("123ab")) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
