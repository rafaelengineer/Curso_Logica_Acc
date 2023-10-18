import java.util.Scanner;
import java.util.Vector;

public class Ex_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int matchingElements = 0;
        Vector<Integer> gabarito = new Vector<>();
        Vector<Integer> apostas = new Vector<>();

        for (int i = 0; i < 5; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero do gabarito: ");
            int num = scanner.nextInt();
            gabarito.add(num);
        }
        for (int i = 0; i < 10; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero das apostas: ");
            int num = scanner.nextInt();
            apostas.add(num);
        }
        scanner.close();
        
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j< 10;j++){
                if (apostas.get(j).equals(gabarito.get(i))) {
                    matchingElements++;
                }
            }
        }
        System.out.println(matchingElements+" dezenas foram acertadas!");
    }
}
