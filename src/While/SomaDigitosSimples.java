import java.util.Scanner;

public class SomaDigitosSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        int soma = 0;
        int num = Math.abs(n);
        
        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }
        
        System.out.println("Soma dos dígitos: " + soma);
    }
}