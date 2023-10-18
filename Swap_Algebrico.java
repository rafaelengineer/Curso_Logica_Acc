import java.util.Scanner;

public class Swap_Algebrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira valor de A: ");
        double A = scanner.nextDouble();
        System.out.println("Insira valor de B: ");
        double B = scanner.nextDouble();

        if (A != B) {
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            A += B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            B = A - B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
            A = A - B;
            System.out.println("Atual A: "+ A+ ", Atual B: "+ B);
        }

      System.out.println("Novo valor de A: " + A);
      System.out.println("Novo valor de B: " + B);
    }
  }