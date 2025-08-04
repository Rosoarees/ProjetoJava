import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("Digite um número de 1 a 5: ");
            num = input.nextInt();
        } while (num < 1 || num > 5);
        
        System.out.println("Número correto: " + num);
    }
}