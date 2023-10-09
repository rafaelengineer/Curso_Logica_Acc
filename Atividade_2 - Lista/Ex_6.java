import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        // Declaração das variáveis
        double valorHora = 0;
        int hrTrabalho = 0;
        double salario = 0;
        final int semanas = 4;
        final int hrSem = 40;

        // Entrada de dados
        System.out.print("Digite o valor hora em reais: R$");
        Scanner scanner = new Scanner(System.in);
        valorHora = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas: ");
        hrTrabalho = scanner.nextInt();

        // Cálculo do salário
        if (hrTrabalho > semanas * hrSem) {
            salario = (1.3 * hrTrabalho - 0.3 * semanas * hrSem) * valorHora;
        } else {
            salario = hrTrabalho * valorHora;
        }

        // Saída de dados
        System.out.println("O valor a receber é: R$" + String.format("%.2f", salario));

    }
}