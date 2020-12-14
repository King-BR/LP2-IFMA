package atv11;

public class Funcionario {
    private String nome = "null";
    private double salario = 0;

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public double getSalario() {
        return this.salario;
    }

    public String salarioToString() {
        return Double.toString(this.getSalario());
    }
}
