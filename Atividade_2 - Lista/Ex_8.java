public class Ex_8 {

    public static void main(String[] args) {

        // Declara��o das vari�veis
        final String nome_100 = "Cachorro quente";
        final String nome_101 = "Bauru simples";
        final String nome_102 = "Bauru com ovo";
        final String nome_103 = "Hamb�rguer";
        final String nome_104 = "Cheeseburguer";
        final String nome_105 = "Refrigerante";
        final int preco_100 = 120;
        final int preco_101 = 130;
        final int preco_102 = 150;
        final int preco_103 = 120;
        final int preco_104 = 130;
        final int preco_105 = 100;
        int pedido = 0;

        // L� o c�digo do pedido
        System.out.print("Insira o c�digo do pedido: ");
        pedido = Integer.parseInt(System.console().readLine());

        // Imprime o pedido e o pre�o
        switch (pedido) {
            case 100:
                System.out.println("\nPedido: " + nome_100 + "........ pre�o: " + preco_100);
                break;
            case 101:
                System.out.println("\nPedido: " + nome_101 + "........ pre�o: " + preco_101);
                break;
            case 102:
                System.out.println("\nPedido: " + nome_102 + "........ pre�o: " + preco_102);
                break;
            case 103:
                System.out.println("\nPedido: " + nome_103 + "........ pre�o: " + preco_103);
                break;
            case 104:
                System.out.println("\nPedido: " + nome_105 + "........ pre�o: " + preco_104);
                break;
            case 105:
                System.out.println("\nPedido: " + nome_105 + "........ pre�o: " + preco_105);
                break;
        }
    }
}
