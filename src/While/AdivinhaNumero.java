import java.util.Scanner;

public class AdivinhaNUmero{

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num;

        int numSecreto = 7;

        System.out.print("Tente divinhar o numero secreto: ");
        num = ler.nextInt();

        while (num != numSecreto) {
          if (num > numSecreto){

            System.out.println("O numero secreto e ");
          }
          else if (num < numSecreto) {
            System.out.println("O numero secreto e mair ");

          }
          System.out.print("Você digitou o número errado, tente novamente: ");
          num = ler.nextInt();

        }
        System.out.println("Parabéns você acertou o numero secreto");

    }
}