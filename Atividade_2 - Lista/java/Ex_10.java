import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaMulheres = 0;
        int numHomens = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Informe a altura (em metros) da pessoa " + (i + 1) + " : ");
            double altura = scanner.nextDouble();
            
            System.out.print("Informe o sexo (M/F) da pessoa " + (i + 1)+" : ");
            char sexo = scanner.next().charAt(0);
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
            if (sexo == 'F' || sexo == 'f') {
                somaAlturaMulheres += altura;
            } else if (sexo == 'M' || sexo == 'm') {
                numHomens++;
            }
        }
        
        double mediaAlturaMulheres = somaAlturaMulheres / 50;
        
        System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
        System.out.println("Menor altura do grupo: " + menorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Número de homens: " + numHomens);
        
        scanner.close();
    }
}
