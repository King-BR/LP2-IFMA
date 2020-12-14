package atv11;

public class Professor extends Funcionario {
    private int horasAula = 0;

    public void setHorasAula(int quantHorasAula) {
        this.horasAula = quantHorasAula;
    }

    public int getHorasAula() {
        return this.horasAula;
    }

    public String horasAulaToString() {
        return Integer.toString(this.getHorasAula());
    }

    public double salarioTotal() {
        return this.getSalario() + (this.getHorasAula() * 20);
    }

    public String salarioTotalToString() {
        return Double.toString(this.salarioTotal());
    }
}
