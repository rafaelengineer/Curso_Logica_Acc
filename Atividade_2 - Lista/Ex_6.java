import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        int qtdMax = 0;
        int qtdMin = 0;
        int qtdEstoque = 0;

        System.out.println("Opa");

        System.out.print("Digite a quantidade em Estoque: ");
        Scanner scanner = new Scanner(System.in);
        qtdEstoque = scanner.nextInt();
        System.out.print("Digite a quantidade Máxima: ");
        qtdMax = scanner.nextInt();
        System.out.print("Digite a quantidade Mínima: ");
        qtdMin = scanner.nextInt();
        scanner.close();

        int qtdMedia = (qtdMax + qtdMin) / 2;

        if (qtdEstoque > qtdMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}