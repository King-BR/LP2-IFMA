import java.util.Scanner;

public class atv8quest2 {
    public float novoSalario(float salario, float porcento) {
        float salarioComAumento;

        salarioComAumento = salario + (salario * (porcento/100));

        return salarioComAumento;
    }

    public static void main(String[] args) {
        atv8quest2 s = new atv8quest2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        float salario = sc.nextFloat();

        System.out.print("Diga a porcentagem do aumento: ");
        float porcento = sc.nextFloat();

        float novoSalario = s.novoSalario(salario, porcento);

        System.out.println("\nNovo salario: " + novoSalario);
    }
}
