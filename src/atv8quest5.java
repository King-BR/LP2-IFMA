import java.util.Scanner;

public class atv8quest5 {
    public String mes(int num) {
        switch (num) {
            case 1: {
                return "janeiro";
            }
            case 2: {
                return "fevereiro";
            }
            case 3: {
                return "março";
            }
            case 4: {
                return "abril";
            }
            case 5: {
                return "maio";
            }
            case 6: {
                return "junho";
            }
            case 7: {
                return "julho";
            }
            case 8: {
                return "agosto";
            }
            case 9: {
                return "setembro";
            }
            case 10: {
                return "outubro";
            }
            case 11: {
                return "novembro";
            }
            case 12: {
                return "dezembro";
            }
            default: {
                return "Numero invalido";
            }
        }
    }

    public static void main(String[] args) {
        atv8quest5 s = new atv8quest5();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int num = sc.nextInt();

        System.out.println("\n" + s.mes(num));
    }
}
