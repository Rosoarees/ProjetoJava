import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        
        try {
            System.out.print("Digite um número:");
             numero = ler.nextInt();
            System.out.println("Você digitou: " + numero);
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números!");
            
        } finally {
            ler.close();
            System.out.println("Programa encerrado.");
        }
    }
}