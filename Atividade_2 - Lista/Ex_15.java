import java.util.Scanner;
import java.util.Vector;

public class Ex_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int matchingElements = 0;
        Vector<Integer> sequencia1 = new Vector<>();
        Vector<Integer> sequencia2 = new Vector<>();

        for (int i = 0; i < 5; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero da sequencia 1: ");
            int num = scanner.nextInt();
            sequencia1.add(num);
        }
        for (int i = 0; i < 5; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero das sequencia 2: ");
            int num = scanner.nextInt();
            sequencia2.add(num);
        }
        scanner.close();
        
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j< 5;j++){
                if (sequencia1.get(j).equals(sequencia2.get(i))) {
                    matchingElements++;
                }
            }
        }
        System.out.println(matchingElements+" elementos coincidem nas duas sequencias!");
    }
}
