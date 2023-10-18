import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cargo = new String("");
        double salario = 0;
        String continua = new String("yes");
        double percentual = 0;
        while(!continua.equals("n") || !continua.equals("nao")){
            cargo = scanner.nextLine("Insira o cargo: ");
            salario = scanner.nextDouble("Insira o salário: ");

            switch(cargo.toLowerCase(null)){
                case "gerente":
                    System.out.println("O novo salário desse "+cargo+" é de R$"+salario*1,1);
                    break;
                case "engenheiro":
                    System.out.println("O novo salário desse "+cargo+" é de R$"+salario*1,2);
                    break;
                case "tecnico":
                    System.out.println("O novo salário desse "+cargo+" é de R$"+salario*1,3);
                    break;
                defaut:
                    System.out.println("O novo salário desse "+cargo+" é de R$"+salario*1,4);
                    break;
            }
            continua = scanner.nextLine("Inserir mais um cargo? : ");
        }
        scanner.close();
    }
}
