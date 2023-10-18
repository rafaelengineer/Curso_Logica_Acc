import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[9];
        System.out.println("Insira 10 valores numericos:");

        for (int i = 0; i < 9; i++) {
            System.out.print("Insira o valor #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        bubbleSort(numeros);

        System.out.println("Imprime valores ordenados:");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); 
        double soma = calculateSum(numeros);
        System.out.println("Soma dos dois maiores valores eh: " + soma);

        scanner.close();
    }

    private static void bubbleSort(double[] vetor) {
        int n = vetor.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    double temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static double calculateSum(double[] vetor) {
        double soma = 0;
        //for (double num : arr) {
        for (int i = 7; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}
