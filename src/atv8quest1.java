import java.util.Scanner;

public class atv8quest1 {
    public int menor(int num1, int num2) {
        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        atv8quest1 m = new atv8quest1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("\nO menor numero é: " + m.menor(num1, num2));
    }
}
