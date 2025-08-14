import java.util.InputMismatchException;
import java.util.Scanner; // Importa a classe para tratar erros de entrada

public class Subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usando o bloco try-catch para evitar que o programa quebre
        // se o usuário digitar algo que não seja um número.
        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            // 1. CORREÇÃO DA OPERAÇÃO: Trocado o sinal de '+' para '-'.
            int resultado = num1 - num2;

            // 2. CORREÇÃO DA MENSAGEM: A mensagem agora descreve a operação correta.
            System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " é: " + resultado);

        } catch (InputMismatchException e) {
            // Este bloco é executado se o usuário digitar letras ou símbolos.
            System.out.println("Erro: Por favor, digite apenas números inteiros válidos!");
        } finally {
            // O scanner é fechado no final, independentemente de ter ocorrido erro ou não.
            scanner.close();
        }
    }
}