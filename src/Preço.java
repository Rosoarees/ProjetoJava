import java.util.Scanner;
import java.util.Locale;

public class MenuLanchoneteIfElse {

    public static void main(String[] args) {

     
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

     
        System.out.println("--- Cardápio ---");
        System.out.println("1: Misto Quente - R$ 5,00");
        System.out.println("2: X-Salada     - R$ 10,50");
        System.out.println("3: X-Bacon      - R$ 12,75");
        System.out.println("4: Bauru        - R$ 8,00");
        System.out.println("5: Refrigerante - R$ 4,50");
        System.out.println("----------------");

       
        System.out.print("Digite o código do lanche (1 a 5): ");

     
        int codigo = leitor.nextInt();

       
        if (codigo == 1) {
            System.out.println("Produto: Misto Quente");
            System.out.printf("Preço: R$ %.2f%n", 5.00);
        } else if (codigo == 2) {
            System.out.println("Produto: X-Salada");
            System.out.printf("Preço: R$ %.2f%n", 10.50);
        } else if (codigo == 3) {
            System.out.println("Produto: X-Bacon");
            System.out.printf("Preço: R$ %.2f%n", 12.75);
        } else if (codigo == 4) {
            System.out.println("Produto: Bauru");
            System.out.printf("Preço: R$ %.2f%n", 8.00);
        } else if (codigo == 5) {
            System.out.println("Produto: Refrigerante");
            System.out.printf("Preço: R$ %.2f%n", 4.50);
        } else {
           
            System.out.println("Código inválido.");
        }

     
        leitor.close();
    }
}