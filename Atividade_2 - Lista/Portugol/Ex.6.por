public class Estoque {
    public static void main(String[] args) {
        // Declaração das variáveis
        int qtdMax = 0;
        int qtdMin = 0;
        int qtdEstoque = 0;

        // Saída de dados
        System.out.println("Opa");

        // Entrada de dados
        System.out.print("Digite a quantidade em Estoque: ");
        Scanner scanner = new Scanner(System.in);
        qtdEstoque = scanner.nextInt();
        System.out.print("Digite a quantidade Máxima: ");
        qtdMax = scanner.nextInt();
        System.out.print("Digite a quantidade Mínima: ");
        qtdMin = scanner.nextInt();

        // Cálculo da quantidade média
        int qtdMedia = (qtdMax + qtdMin) / 2;

        // Impressão do resultado
        if (qtdEstoque > qtdMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}
