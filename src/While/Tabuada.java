import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número (1-10): ");
        int num = input.nextInt();
        
        System.out.println("\nTabuada do " + num + ":");
        
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + num*i);
            i++;
        }
    }
}