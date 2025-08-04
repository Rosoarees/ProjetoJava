import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n; 
        int ehPrimo;

        System.out.print("Digite um número à ser verificado: ");
        n = ler.nextInt();
        
        ehPrimo = n % 2;
        for (;ehPrimo != 0 || n == 2;) {
            System.out.println(n + " é um número primo!");
            if ( ehPrimo == 0 && n != 2) {
                System.out.println(n + " não é primo.");   
                }
            break;
        }
        
    ler.close();    
    }
}