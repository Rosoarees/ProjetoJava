import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws Exception {
        System.out.println("Numero");

        Scanner ler = new Scanner(System.in);
        int n1, n2, op
        ;

        System.out.print("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("\nDigite1 p/ soma \nDigite 2 p/ divisão \nDigite 3 p/ subtração \nDigite 4 p/ multiplicaçao \n --------->");
        op = ler.nextInt();

        switch (op) {
            case 1:
        
            System.out.println("A soma tem o resultado de "+(n1+n2));
            break;
            case 2:
            System.out.println("A divisão tem o resultado de "+(n1/n2));
            break;
            case 3:
            System.out.println("A subtração tem o resultado de "+(n1-n2));
            break;
            case 4:
            System.out.println("A multiplicação tem o resultado de "+(n1*n2));
            break;
            default:
            System.err.println("Operador inválido");
            
        }
        ler.close();

    }
}
