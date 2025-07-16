import java.util.Scanner;

public class exercicio18 {
      public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        System.out.print("digite um número de 1 á 5:");
        num = ler.nextInt();

        if (num ==1){
            System.out.println("você digitou o número UM!");
        }
        else if  (num ==2){
            System.out.println("você digitou o número DOIS!");
        }
        else if (num ==3){
            System.out.println("você digitou o número TRÊS!");
        }
        else if (num ==4){
            System.out.println("você digitou o número QUATRO!");
        }
        else if (num ==5){
            System.out.println("você digitou o número CINCO!");
        }
        else {
             System.out.println("número inválido");
        } ler.close();
      }
    }