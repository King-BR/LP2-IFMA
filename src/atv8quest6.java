import java.util.Scanner;

public class atv8quest6 {
    public void fibonacci(int num) {
        System.out.print("\n");

        int temp1= 1, temp2 = 0;

        for (int i = 0; i < num; i++) {
            if (i == 0) {
                temp1 = 1;
                temp2 = 0;
            } else {
                temp1 += temp2;
                temp2 = temp1 - temp2;
            }

            System.out.print(temp1 + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        atv8quest6 s = new atv8quest6();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        s.fibonacci(num);
    }
}
