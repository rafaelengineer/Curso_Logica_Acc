import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = -999;
        int contador = 10;
        int foraIntervalo = 0;
        
        while (contador > 0) {
            System.out.print("Entre com um valor inteiro: ");
            entrada = scanner.nextInt();
            
            if (entrada <= 10 || entrada >= 20) {
                foraIntervalo++;
            }
            
            contador--;
        }
        scanner.close();

        System.out.println("\nForam digitados " + foraIntervalo + " fora do intervalo");
        System.out.println("Foram digitados " + (10 - foraIntervalo) + " dentro do intervalo");
    }
}
