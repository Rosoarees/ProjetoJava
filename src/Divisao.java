import java.util.InputMismatchException;
import java.util.Scanner; // É uma boa prática importar a exceção específica.

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Não é necessário inicializar as variáveis aqui se o try-catch for bem estruturado.

        try {
            System.out.print("Digite o primeiro número (dividendo): ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número (divisor): ");
            int num2 = scanner.nextInt();

            // A lógica de divisão por zero está correta.
            if (num2 == 0) {
                System.out.println("Erro: Divisão por zero não é permitida!");
            } else {
                // A conversão (cast) para double garante o resultado preciso.
                double resultado = (double) num1 / num2;
                System.out.printf("O resultado da divisão de %d por %d é: %.2f%n", num1, num2, resultado);
            }

        } catch (InputMismatchException e) {
            // Este bloco SÓ é executado se o usuário digitar algo que não é um inteiro.
            System.out.println("Erro: Por favor, digite apenas números inteiros válidos!");

        } finally {
            // Este bloco é SEMPRE executado, garantindo que o scanner seja fechado.
            scanner.close();
        }
    }
}