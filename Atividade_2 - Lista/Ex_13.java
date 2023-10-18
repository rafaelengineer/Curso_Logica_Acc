import java.util.Scanner;
public class Ex_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        String[] nomes = new String[10];

        for (int idx = 0; idx < 10; idx++) {
            System.out.print((idx + 1) + "/10 - Digite mais um nome: ");
            nome = scanner.nextLine();
            nomes[idx] = nome;
        }

        System.out.print("Digite um nome para ser procurado: ");
        nome = scanner.nextLine();

        for (int idx = 0; idx < 10; idx++) {
            if (nomes[idx].equals(nome)) {
                System.out.println("Achei!!! Está na posição: " + (idx + 1));
                break;
            } else if (idx == 9) {
                System.out.println("Não encontrado, " + nome);
            }
        }

        scanner.close();
    }
}
