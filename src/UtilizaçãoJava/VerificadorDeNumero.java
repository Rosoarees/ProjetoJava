import java.util.Scanner;

public class VerificadorDeNumero {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
     
        System.out.print("Digite um número: ");
       
        int numero = leitor.nextInt();
     
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }
       
        else if (numero < 0) {
            System.out.println("O número é negativo.");
        }
       
        else {
            System.out.println("O número é zero.");
        }

        // Fecha o scanner para liberar os recursos.
        leitor.close();
    }
}
