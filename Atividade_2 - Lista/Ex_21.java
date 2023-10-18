import java.util.Vector;
import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String avalicao = new String("");
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float ME = 0;
        float MA = 0;
        
        for(int idx = 0; idx <= 3 ; idx++){
            System.out.println("Tecle enter");
            String tecle = scanner.nextLine();
            System.out.print("Qual avalição será lançada: ");
            avalicao = scanner.nextLine();
            switch(avalicao.toLowerCase()){
                case "1", "conta1", "c1":
                    System.out.println("Escreva a nota1: ");
                    nota1 = scanner.nextFloat();
                    break;
                case "2", "conta2", "c2":
                    System.out.println("Escreva a nota2: ");
                    nota2 = scanner.nextFloat();
                    break;
                case "3", "conta3", "c3":
                    System.out.println("Escreva a nota3: ");
                    nota3 = scanner.nextFloat();
                    break;
                default:
                    System.out.println("Escreva a nota dos exercicios: ");
                    ME = scanner.nextFloat();
                    break;
            }
        }
        tecle = "";
        scanner.close();
        MA = (nota1 + nota2 * 2 + nota3 * 3 + ME) / 7 ;
       if(MA>=9)
        System.out.println("A");
        else if(MA>=8)
        System.out.println("B");
        else if(MA>=7)
        System.out.println("C");
        else if(MA>=6)
        System.out.println("D");
        else if(MA>=4)
        System.out.println("E");
        else
        System.out.println("F");
    }
}