import java.util.Scanner;
public class Ex_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int[] nums = new int[10];

        for (int idx = 0; idx < 10; idx++) {
            System.out.print((idx + 1) + "/10 - Digite mais um numero: ");
            num = scanner.nextInt();
            nums[idx] = num;
        }

        System.out.print("Digite um numero para ser procurado: ");
        num = scanner.nextInt();

        for (int idx = 0; idx < 10; idx++) {
            if (nums[idx] == num) {
                System.out.println("Achei!!! Está na posição: " + (idx + 1));
                break;
            } else if (idx == 9) {
                System.out.println("Não encontrado, " + num);
            }
        }

        scanner.close();
    }
}
