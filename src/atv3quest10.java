import javax.swing.JOptionPane;

public class atv3quest10 {
    public static void main(String[] args) {
        int voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de voltas")), melhorVolta = 0;
        double media = 0, melhorTempo = 0;

        for (int i = 1; i <= voltas; i++) {
            double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da volta " + i).replace(",", "."));

            if(tempo < melhorTempo || melhorTempo == 0) {
                melhorTempo = tempo;
                melhorVolta = i;
            }

            media += tempo;
        }

        media = media/voltas;

        System.out.printf("Melhor tempo: %.2f\nMelhor volta: %d\nMedia de tempo: %.2f", melhorTempo, melhorVolta, media);
    }
}
