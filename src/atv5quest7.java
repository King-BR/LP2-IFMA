import javax.swing.JOptionPane;

public class atv5quest7 {
    public static void main(String[] args) {
        int vetorA[] = new int[10], vetorB[] = new int[10];

        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println(vetorB[i]);
        }
    }
}