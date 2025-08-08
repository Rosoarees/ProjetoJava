import java.util.Scanner;

public class DivisãoSegura {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a;
        int b;
        int resultado;

        System.out.print("Digite um número para ser dividido: ");
        a = ler.nextInt();

        System.out.print("Digite o segundo número (divisor): ");
         b = ler.nextInt();

        try {
             resultado = a / b;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero!");
            
        } finally {
            ler.close(); 
            System.out.println("Operação concluída.");
        }
    }
}