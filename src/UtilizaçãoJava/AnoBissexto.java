
import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
        int ano; 

        System.out.print("Digite o ano que deseja consultar: ");
        ano = ler.nextInt();

      
        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
          
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
        
            System.out.println("O ano " + ano + " é um ano comum.");
        }
        
     
        ler.close();
    }
}