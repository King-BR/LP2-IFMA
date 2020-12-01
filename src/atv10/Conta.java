package atv10;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public void setNumero(int num) {
        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setLimite(double valor) {
        this.limite = valor;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean saca(double valor) {
        if(valor > this.getSaldo()) {
            return false;
        }

        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void transfere(Conta contaDestino, double valor) {
        if(valor > this.getSaldo()) {
            return;
        }

        this.setSaldo(this.getSaldo() - valor);
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
    }
}
