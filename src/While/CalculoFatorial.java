import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        long fatorial = 1;

        System.out.print("Digite o valor para descobrir o fatorial: ");
        num = ler.nextInt();

        if (num < 0) {
            System.out.println("Fatorial de número negativo não existe!");
        } else {
            int total = 1;  
            while (total <= num) {
                fatorial *= total;
                total++;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }
        
        ler.close();
    }
}