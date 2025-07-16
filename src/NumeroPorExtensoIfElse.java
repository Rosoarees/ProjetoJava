import java.util.Scanner;

public class NumeroPorExtensoIfElse {

    public static void main(String[] args) {

     
        Scanner ler = new Scanner(System.in);

       
        System.out.print("Digite um número de 1 a 5: ");

       
        int numero = ler.nextInt();

       
        if (numero == 1) {
            System.out.println("Você digitou o número Um");
        }
     
        else if (numero == 2) {
            System.out.println("Você digitou o número Dois");
        }
       
        else if (numero == 3) {
            System.out.println("Você digitou o número Três");
        }
        else if (numero == 4) {
            System.out.println("Você digitou o número Quatro");
        } 
        else if (numero == 5) {
            System.out.println("Você digitou o número Cinco");
        }
     
        else {
            System.out.println("Número inválido.");
        }

     
        ler.close();
    }
}
