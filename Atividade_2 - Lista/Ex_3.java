import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 1000;
        int nota = 0;
        int notas = 6;
        while (notas >0){
            System.out.print("Escreva uma das notas: ");
            nota = scanner.nextInt();
            if (nota>maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
            notas -- ;
        }
        scanner.close();

        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
    }
}
