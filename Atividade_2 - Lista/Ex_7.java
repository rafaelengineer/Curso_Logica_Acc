public class Ex_7 {

    public static void main(String[] args) {

        // Declara��o das vari�veis
        int qtdMax = 0;
        int qtdMin = 0;
        int qtdEstoque = 0;

        System.out.println("Opa");

        System.out.print("Digite a quantidade em Estoque: ");
        qtdEstoque = Integer.parseInt(System.console().readLine());

        System.out.print("Digite a quantidade M�xima: ");
        qtdMax = Integer.parseInt(System.console().readLine());

        System.out.print("Digite a quantidade M�nima: ");
        qtdMin = Integer.parseInt(System.console().readLine());

        if (qtdEstoque > (qtdMax + qtdMin) / 2) {
            System.out.println("N�o efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}