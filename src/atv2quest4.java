import javax.swing.JOptionPane;

public class atv2quest4 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador"));
        String categoria;

        if(idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if(idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if(idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if(idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = null;
        }

        if (categoria != null) {
            System.out.println("O jogador pertence a categoria: " + categoria);
        } else {
            System.out.println("O jogador não pertence a nenhuma categoria");
        }
    }
}
