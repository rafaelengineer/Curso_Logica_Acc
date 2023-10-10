public class Ex_7 {

    public static void main(String[] args) {

        // Declaração das variáveis
        int qtdMax = 0;
        int qtdMin = 0;
        int qtdEstoque = 0;

        System.out.println("Opa");

        System.out.print("Digite a quantidade em Estoque: ");
        qtdEstoque = Integer.parseInt(System.console().readLine());

        System.out.print("Digite a quantidade Máxima: ");
        qtdMax = Integer.parseInt(System.console().readLine());

        System.out.print("Digite a quantidade Mínima: ");
        qtdMin = Integer.parseInt(System.console().readLine());

        if (qtdEstoque > (qtdMax + qtdMin) / 2) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}