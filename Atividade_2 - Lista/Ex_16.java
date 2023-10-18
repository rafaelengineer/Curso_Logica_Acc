import java.util.Scanner;
import java.util.Vector;

public class Ex_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean matchingElements = false;
        Vector<Integer> sequencia1 = new Vector<>();

        for (int i = 0; i < 49; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero da sequencia: ");
            int num = scanner.nextInt();
            sequencia1.add(num);
        }
        scanner.close();
        
        for (int i = 0; i < 48; i++) {
            for(int j = i++; j< 49;j++){
                if (sequencia1.get(i).equals(sequencia1.get(j))) {
                    matchingElements = true;
                    int i_ = i+2;
                    int j_ = j++;
                    System.out.println("Os elementos das posições: "+ i_ + " e " + j_ + " são iguais.");
                }
            }
        } if (!matchingElements) {
                    System.out.println("Não há elementos que coincidem.");
        }
    }
}
