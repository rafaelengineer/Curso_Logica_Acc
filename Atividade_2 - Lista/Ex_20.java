import java.util.Scanner;
import java.util.Vector;

public class Ex_20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        int l = 0;
        Vector<Integer> vec_x = new Vector<>();
        Vector<Integer> vec_y = new Vector<>();
        Vector<Integer> vec_r = new Vector<>();

        for (int i = 0; i < 10; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero do vetor X: ");
            int num = scanner.nextInt();
            vec_x.add(num);
        }
        for (int i = 0; i < 10; i++) {
            int j = i+1;
            System.out.print("Insita o "+ j + "º numero do vetor Y: ");
            int num = scanner.nextInt();
            vec_y.add(num);
        }
        scanner.close();
        
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                vec_r.add(i, vec_x.get(l));
                l++;
            }else {
                vec_r.add(i, vec_y.get(k));
                k++;
            }
        }
        for (Integer elemento : vec_r) {
            System.out.println(elemento+"; ");
        }
    }
}
