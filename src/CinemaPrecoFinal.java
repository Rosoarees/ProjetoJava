
import java.util.Scanner;

public class CinemaPrecoFinal {

    public static void main(String[] argas) throws Exception{

        Scanner ler = new  Scanner(System.in);
        int idade;
        double meiaEntrada = 15.00;
        double entrada = 30.00;

        System.out.print("Digite a sua idade:");
        idade = ler.nextInt();

        if(idade >= 60){
            System.out.println("Você deve pagar meia entrada: ");
        }
        else if (idade < 60){
         System.out.println("Você deve pagar o valor de uma entrada inteira:");

        }
        else {
            System.out.println("Você digitou uma idade incorreta");

        }
        ler.close();


       

    }
    
}
