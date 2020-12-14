package atv11;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("O funcionario é um professor? (s/n) ");
        String res = sc.next();

        if(res.equals("n")) {
            Funcionario novoFuncionario = new Funcionario();

            System.out.print("\nDigite o nome do funcionario: ");
            novoFuncionario.setNome(sc.next());

            System.out.print("Digite o salario do funcionario: ");
            novoFuncionario.setSalario(sc.nextDouble());

            System.out.printf("\nNome: %s\nSalario: R$%s\n", novoFuncionario.getNome(), novoFuncionario.salarioToString());
        } else if(res.equals("s")) {
            Professor novoProfessor = new Professor();

            System.out.print("\nDigite o nome do professor: ");
            novoProfessor.setNome(sc.next());

            System.out.print("Digite o salario do professor: ");
            novoProfessor.setSalario(sc.nextDouble());

            System.out.print("Digite a quantidade de horas aula: ");
            novoProfessor.setHorasAula(sc.nextInt());

            System.out.printf("\nNome: %s\nSalario base: R$%s\nHoras aula: %d\nSalario total: R$%s\n", novoProfessor.getNome(), novoProfessor.salarioToString(), novoProfessor.getHorasAula(), novoProfessor.salarioTotalToString());
        } else {
            System.out.println("Resposta invalida");
        }
    }
}
