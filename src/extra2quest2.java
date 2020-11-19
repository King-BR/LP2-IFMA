import javax.swing.JOptionPane;

public class extra2quest2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
        String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa");

        System.out.println("Nome: " + nome);
        System.out.print("Sexo: ");
        switch (sexo) {
            case "m":
            case "M": {
                System.out.println("Masculino");
                break;
            }
            case "f":
            case "F": {
                System.out.println("Feminino");
                break;
            }
            default: {
                System.out.println("Indefinido");
            }
        }
    }
}