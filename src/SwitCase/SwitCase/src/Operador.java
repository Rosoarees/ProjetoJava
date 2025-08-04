import java.util.Scanner;

public class Operador{
    public static void main(String[] args) throws Exception {
        System.out.println("Numero");

        Scanner ler = new Scanner(System.in);
        int n1, n2;
        char op;

        

        System.out.print("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("\nDigite '+' p/ soma \nDigite '/' p/ divisão \nDigite '-' p/ subtração \nDigite '*' p/ multiplicaçao \n --------->");
        op = ler.next().charAt(0)

        switch (op) {
            case '+':
        
            System.out.println("A soma tem o resultado de "+(n1+n2))
            break;
            case '/':
            System.out.println("A divisão tem o resultado de "+(n1/n2));
            break;
            case '-':
            System.out.println("A subtração tem o resultado de "+(n1-n2));
            break;
            case '*':
            System.out.println("A multiplicação tem o resultado de "+(n1*n2));
            break;
            default:
            System.err.println("Operador inválido");
            
        }
        ler.close();

    }
}
