public class Estoque {
    public static void main(String[] args) {
        // Declara��o das vari�veis
        int qtdMax = 0;
        int qtdMin = 0;
        int qtdEstoque = 0;

        // Sa�da de dados
        System.out.println("Opa");

        // Entrada de dados
        System.out.print("Digite a quantidade em Estoque: ");
        Scanner scanner = new Scanner(System.in);
        qtdEstoque = scanner.nextInt();
        System.out.print("Digite a quantidade M�xima: ");
        qtdMax = scanner.nextInt();
        System.out.print("Digite a quantidade M�nima: ");
        qtdMin = scanner.nextInt();

        // C�lculo da quantidade m�dia
        int qtdMedia = (qtdMax + qtdMin) / 2;

        // Impress�o do resultado
        if (qtdEstoque > qtdMedia) {
            System.out.println("N�o efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}
