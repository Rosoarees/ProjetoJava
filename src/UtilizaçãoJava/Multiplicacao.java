import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        resultado = num1 * num2;

   
        System.out.println("O resultado da multiplicação de " + num1 + " * " + num2 + " é: " + resultado);

        scanner.close();
    }
}
   