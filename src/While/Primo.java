import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número maior que 1: ");
        int num = input.nextInt();
        
        boolean primo = true;
        int teste = 2;
        
        while (teste < num) {
            if (num % teste == 0) {
                primo = false;
            }
            teste++;
        }
        
        if (primo) {
            System.out.println(num + " é primo!");
        } else {
            System.out.println(num + " não é primo.");
        }
    }
}