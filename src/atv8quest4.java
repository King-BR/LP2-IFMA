import java.util.Scanner;

public class atv8quest4 {
    public int divisivel(int x, int y) {
        if(x % y == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        atv8quest4 s = new atv8quest4();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        if(s.divisivel(x, y) == 1) {
            System.out.println("\nÉ divisivel");
        } else {
            System.out.println("\nNão é divisivel");
        }
    }
}
