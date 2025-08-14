import java.util.Scanner;
public class PositivoNegativo {


public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.print("digite um número:");
        int numero = ler.nextInt();
        if (numero > 0){
        System.out.println("o número é positivo.");
        } else if  (numero < 0){
            System.out.println("o número é negativo.");
        }else {
            System.out.println("o número é zero.");
        }
        ler.close();


 }
}