import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas ma��s vc quer levar: ");
        int Qtd = scanner.nextInt();
        if (Qtd<12) {
            Qtd *= 1.3;
        }
        scanner.close();
        System.out.println("O Valor total a pagar ser�: R$"+Qtd+",00");
    }
}
