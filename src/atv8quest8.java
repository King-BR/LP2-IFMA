import java.util.Scanner;

public class atv8quest8 {
    public float media(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3)/3;
    }

    public static void main(String[] args) {
        atv8quest8 s = new atv8quest8();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.print("Digite a nota 3: ");
        float nota3 = sc.nextFloat();

        if(s.media(nota1, nota2, nota3) >= 7 ) {
            System.out.println("\nAprovado");
        } else {
            System.out.println("\nReprovado");
        }
    }
}
