import java.util.Scanner;

public class Ex_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escreva um valor: ");
        String Var = scanner.nextLine();
        String Var_2= "";
        
        while (!Var.equals("sair")){
            System.out.print("Escreva outro valor (ou 'sair' para terminar): ");
            Var_2 = Var;
            Var = scanner.nextLine();   
            System.out.println("O valor anterior era: "+Var_2);
        }
        scanner.close();
    }
}
