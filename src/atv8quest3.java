import java.util.Scanner;

public class atv8quest3 {
    public void retangulo(float lado1, float lado2) {
        float perimetro = lado1 * 2 + lado2 * 2;
        float area = lado1 * lado2;

        System.out.println("\nPerimetro: " + perimetro + "\nArea: " + area);
    }

    public static void main(String[] args) {
        atv8quest3 s = new atv8quest3();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado 1: ");
        float lado1 = sc.nextFloat();

        System.out.print("Digite o tamanho do lado 2: ");
        float lado2 = sc.nextFloat();

        s.retangulo(lado1, lado2);
    }
}
