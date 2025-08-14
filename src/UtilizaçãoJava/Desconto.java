import java.util.Scanner;
public class Desconto {
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int idade;

        System.out.print("Digite sua idade:");
        idade = ler.nextInt();

        if(idade >= 60){
             System.out.println("você deve pagar meia entrada.");
        }
        else if (idade < 60){
             System.out.println("você deve pagar o valor de entrada inteira. ");
        }
        else{
             System.out.println("você digitou a idade incorreta. ");
        }
        ler.close();
        }
    }    

