import java.util.Scanner;

public class Swap_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira valor de A: ");
        String str1 = scanner.nextLine();
        System.out.println("Insira valor de B: ");
        String str2 = scanner.nextLine();

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        

      System.out.println("Novo valor de A: " + str1 );
      System.out.println("Novo valor de B: " + str2 );
    }
    
}
