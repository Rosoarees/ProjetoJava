import java.util.Scanner;
public class Exercico19 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int primo;
         System.out.print("verificação de números primos: \n apenas números de 1 á 10!");
         System.out.print("digite um número para ser verifivado:");
         primo = ler.nextInt();
         

         if (primo == 1 || primo == 2 || primo == 3 || primo == 5 || primo == 7){
         System.out.print("é um número primo");
         }
         else {
           System.out.print("não é um número primo!!! "); 
         }

         ler.close();
     }
}
