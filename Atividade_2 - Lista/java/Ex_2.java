import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
    int A = 0;
    int B = 0;
    int B3 = 0;
    int Nulo = 0;
    int Qtd = 15;
    char voto = ' ';

    while (Qtd > 0) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Escreva A ou B para registra voto válido: ");
    voto = scanner.nextLine().toUpperCase().charAt(0);
    scanner.close();
    if(voto == 'A'){
        A ++;
        Qtd --;
    }else if(voto == 'B'){
        B ++;
        B3 ++;
        Qtd --;
        if(B3 == 3){
            B3 = 0;
            B --;
            Nulo ++;
        }
    }else {
        Nulo ++;
        Qtd --;
    }
    }
    System.out.println("Votaram em A: " + 100*A/15+"_%");
    System.out.println("Votaram em B: " + 100*B/15+"_%"); 
    System.out.println("Votaram Nulo: " + 100*Nulo/15+"_%");
}
}