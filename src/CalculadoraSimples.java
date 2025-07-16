import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

       
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
       
        char operacao = ler.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

       
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
               
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false; 
                }
                break;
            default:
               
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado é: " + resultado);
        }

       
        ler.close();
    }
}
