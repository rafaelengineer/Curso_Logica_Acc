import java.util.Scanner;

public class Swap_BitWise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira valor de A: ");
        int A = scanner.nextInt();
        System.out.println("Insira valor de B: ");
        int B = scanner.nextInt();

        if (A != B) {
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            A = A ^ B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            B = A ^ B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            A = A ^ B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
        }

      System.out.println("Novo valor de A: " + A);
      System.out.println("Novo valor de B: " + B);
    }
  }