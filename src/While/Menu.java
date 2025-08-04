import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        
        do {
            System.out.println("\n1. Ola\n2. Tchau\n3. Sair");
            System.out.print("Escolha: ");
            op = ler.nextInt();
            
            if (op == 1) {
                System.out.println("Olá!");
            } else if (op == 2) {
                System.out.println("Tchau!");
            } else if (op == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Inválido!");
            }
            
        } while (op != 3);
    }
}