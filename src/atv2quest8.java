import javax.swing.JOptionPane;

public class atv2quest8 {
    public static void main(String[] args) {
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Insira o peso").replace(",", "."));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura").replace(",", "."));
        float imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);
        System.out.print("Faixa de risco: ");
        if(imc < 20) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 20 && imc <= 25) {
            System.out.println("Normal");
        } else if(imc > 25 && imc <= 30) {
            System.out.println("Excesso de peso");
        } else if(imc > 30 && imc <= 35) {
            System.out.println("Obesidade");
        } else if (imc > 35) {
            System.out.println("Obesidade morbida");
        }
    }
}
