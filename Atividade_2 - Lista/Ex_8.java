public class Ex_8 {

    public static void main(String[] args) {

        // Declaração das variáveis
        final String nome_100 = "Cachorro quente";
        final String nome_101 = "Bauru simples";
        final String nome_102 = "Bauru com ovo";
        final String nome_103 = "Hambúrguer";
        final String nome_104 = "Cheeseburguer";
        final String nome_105 = "Refrigerante";
        final int preco_100 = 120;
        final int preco_101 = 130;
        final int preco_102 = 150;
        final int preco_103 = 120;
        final int preco_104 = 130;
        final int preco_105 = 100;
        int pedido = 0;

        // Lê o código do pedido
        System.out.print("Insira o código do pedido: ");
        pedido = Integer.parseInt(System.console().readLine());

        // Imprime o pedido e o preço
        switch (pedido) {
            case 100:
                System.out.println("\nPedido: " + nome_100 + "........ preço: " + preco_100);
                break;
            case 101:
                System.out.println("\nPedido: " + nome_101 + "........ preço: " + preco_101);
                break;
            case 102:
                System.out.println("\nPedido: " + nome_102 + "........ preço: " + preco_102);
                break;
            case 103:
                System.out.println("\nPedido: " + nome_103 + "........ preço: " + preco_103);
                break;
            case 104:
                System.out.println("\nPedido: " + nome_105 + "........ preço: " + preco_104);
                break;
            case 105:
                System.out.println("\nPedido: " + nome_105 + "........ preço: " + preco_105);
                break;
        }
    }
}
