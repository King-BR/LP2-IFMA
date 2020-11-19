import java.util.Scanner;

public class atv8quest7 {
    public void imparOuPar(float num) {
        if(num % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("Não é par");
        }
    }

    public void divisivel(float num) {
        if(num % 3 == 0) {
            System.out.println("É divisivel por 3");
        } else {
            System.out.println("Não é divisivel por 3");
        }
    }

    public static void main(String[] args) {
        atv8quest7 s = new atv8quest7();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float num = sc.nextFloat();

        System.out.print("\n");
        s.imparOuPar(num);
        s.divisivel(num);
    }
}
