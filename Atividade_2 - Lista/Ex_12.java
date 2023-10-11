import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0;
        double numFilhos = 0;
        double mdSalarios = 0;
        double mdNumFilhos = 0;
        double maiorSalario = 0;
        double percSalarioAte_150 = 0;
        int contadorPop = 0;
        String controle = "";

        while (!controle.equals("sair") && !controle.equals("nao") && !controle.equals("n")) {
            contadorPop++;
            System.out.print("Entre com Salario: ");
            salario = scanner.nextDouble();
            System.out.print("Entre com Numero de Filhos: ");
            numFilhos = scanner.nextDouble();

            mdSalarios += salario;
            mdNumFilhos += numFilhos;

            if (maiorSalario < salario) {
                maiorSalario = salario;
            }

            if (salario < 150) {
                percSalarioAte_150++;
            }

            System.out.print("Inserir mais dados? (ou sair): ");
            controle = scanner.next();
        }
        scanner.close();
        
        mdSalarios /= contadorPop;
        mdNumFilhos /= contadorPop;
        percSalarioAte_150 = (percSalarioAte_150 / contadorPop) * 100;

        System.out.println("\n...........\nA média salarial dessa população é: " + String.format("%.2f", mdSalarios));
        System.out.println("A média de filhos nesta população é: " + mdNumFilhos);
        System.out.println("O percentual dessa população que recebe menos de R$150,00: " + String.format("%.2f", percSalarioAte_150) + "%.");
        System.out.println("O maior salário dentre essa população é: R$" + String.format("%.2f", maiorSalario));
    }
}