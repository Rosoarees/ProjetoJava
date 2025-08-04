import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número positivo como limite: ");
        int limite = ler.nextInt();
        
        System.out.println("Sequência de Fibonacci até " + limite + ":");
        
        int a = 0; 
        int b = 1; 
        
    
        System.out.print(a + " " + b + " ");
        
        
        while (a + b <= limite) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            
        
            a = b;
            b = proximo;
        }
    }
}