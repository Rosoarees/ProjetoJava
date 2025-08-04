import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int numAtual = 0;
        int numPosterior = 1;

         System.out.print("Digite um número para saber a sequencia Fibonacci: ");
        int n = ler.nextInt();  

        System.out.println("\nSequência de Fibonacci com " + n + " termos:");

        for (int i = 0; i < n; i++) {
            System.out.print(numAtual + " ");

            int proximo = numAtual + numPosterior;
            numAtual = numPosterior;
            numPosterior = proximo;
        }

        ler.close();  
    }
}
