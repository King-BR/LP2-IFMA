package atv10;

public class Aluno {
    public String nomeAluno;
    public double notaExercicio;
    public double notaTrabalho;
    public double notaProva;

    public void calculaMedia(double pe, double pte, double pp) {
        if((pe + pte + pp) != 1.00) {
            System.out.println("\nERRO: A soma das medias fornecidas foi diferente de 1");
            return;
        }

        double media = ((this.notaExercicio * pe) + (this.notaTrabalho * pte) + (this.notaProva * pp))/(pe + pte + pp);
        System.out.println("\nA media final do aluno " + this.nomeAluno + " foi: " + media);
    }
}
