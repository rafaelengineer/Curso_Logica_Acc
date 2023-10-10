import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        double valorHora = 0;
        int hrTrabalho = 0;
        double salario = 0;
        final int semanas = 4;
        final int hrSem = 40;

        System.out.print("Digite o valor hora em reais: R$");
        Scanner scanner = new Scanner(System.in);
        valorHora = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas: ");
        hrTrabalho = scanner.nextInt();
        scanner.close();

        if (hrTrabalho > semanas * hrSem) {
            salario = (1.3 * hrTrabalho - 0.3 * semanas * hrSem) * valorHora;
        } else {
            salario = hrTrabalho * valorHora;
        }

        System.out.println("O valor a receber é: R$" + String.format("%.2f", salario));

    }
}