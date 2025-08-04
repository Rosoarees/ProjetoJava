import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        char op;


        System.out.print("digite o primeiro número:");
        n1 = ler.nextInt();
         System.out.print("digite o segundo número:");
        n2 = ler.nextInt();
         System.out.print("\n digite '+' soma \n digite '/' dovisão \n digite '-' subtração \n digite '*' multiplicação \n--------->");
        op = ler.next().charAt(0);

        switch (op) {
            case '+':
            
            System.out.println("a soma tem o resultado de " +(n1+n2));
            break;

            case '/':

             System.out.println("a divisão tem o resultado de " +(n1/n2));
             break;
             case '-':

              System.out.println("a subtração tem o resultado de " +(n1-n2));
              break;
            case '*':
                System.out.println("a multiplicação tem o resultado de " +(n1*n2));
                break;
        
            default:
             System.out.println("operador inválido! ");
             

                break;
        }
        ler.close();
    }
}

     
    

