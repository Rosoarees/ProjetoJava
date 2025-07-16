import java.util.Scanner;
public class Exercicio3 {
   
    public static void main(String[]args){

      Scanner ler = new Scanner(System.in);
      System.out.print("digite um número inteiro");
      int numero = ler.nextInt();

      if(numero % 2 == 0){
        System.out.println(" o número " +numero+ "é par.");

      }else {
          System.out.println(" o número " +numero+ "é ímpar."); 
          

      }
      ler.close();
    }
}