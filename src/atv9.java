import java.util.Scanner;

public class atv9 {
    public void gerarCPF() {
        System.out.print("\n\nCPF gerado: ");

        int num1 = (int) (Math.random() * 9);
        int num2 = (int) (Math.random() * 9);
        int num3 = (int) (Math.random() * 9);
        int num4 = (int) (Math.random() * 9);
        int num5 = (int) (Math.random() * 9);
        int num6 = (int) (Math.random() * 9);
        int num7 = (int) (Math.random() * 9);
        int num8 = (int) (Math.random() * 9);
        int num9 = (int) (Math.random() * 9);

        int digito1 = num1 * 10 + num2 * 9 + num3 * 8 + num4 * 7 + num5 * 6 + num6 * 5 + num7 * 4 + num8 * 3 + num9 * 2;
        digito1 = 11 - (digito1 % 11);

        if(digito1 >= 10) {
            digito1 = 0;
        }

        int digito2 = num1 * 11 + num2 * 10 + num3 * 9 + num4 * 8 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3 + digito1 * 2;
        digito2 = 11 - (digito2 % 11);

        if(digito2 >= 10) {
            digito2 = 0;
        }

        System.out.printf("%d%d%d.%d%d%d.%d%d%d-%d%d\n", num1, num2, num3, num4, num5, num6, num7, num8, num9, digito1, digito2);
    }

    public void validarCPF() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nDigite o CPF a ser validado: ");
        String CPF = sc.next();

        CPF = CPF.replace(".", "").replace("-", "");

        if(CPF.length() != 11 || CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999")) {
            System.out.println("CPF invalido");
        }

        int soma = 0;
        int peso = 10;
        for (int i = 0; i < 9; i++) {
            int num = (int) (CPF.charAt(i) - 48);
            soma = soma + (num * peso);
            peso = peso - 1;
        }

        char digito1;
        int resto = 11 - (soma % 11);
        if(resto >= 10) {
            digito1 = '0';
        } else {
            digito1 = (char) (resto + 48);
        }

        soma = 0;
        peso = 11;
        for (int i = 0; i < 10; i++) {
            int num = (int) (CPF.charAt(i) - 48);
            soma = soma + (num * peso);
            peso = peso - 1;
        }

        char digito2;
        resto = 11 - (soma % 11);
        if(resto >= 10) {
            digito2 = '0';
        } else {
            digito2 = (char) (resto + 48);
        }

        //System.out.print(digito1 + "" + digito2 + "\n\n");

        if(CPF.charAt(9) == digito1 && CPF.charAt(10) == digito2) {
            System.out.println("CPF valido");
        } else {
            System.out.println("CPF invalido");
        }
    }

    public void encerrar() {
        System.out.println("\n\nEncerrando o programa...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n1 - Gerar CPF\n2 - Validar CPF\n3 - Encerrar programa\n\nDigite a opção desejada: ");

        int option = sc.nextInt();

        atv9 c = new atv9();

        switch (option) {
            case 1: {
                c.gerarCPF();
                break;
            }
            case 2: {
                c.validarCPF();
                break;
            }
            case 3: {
                c.encerrar();
                break;
            }
        }
    }
}