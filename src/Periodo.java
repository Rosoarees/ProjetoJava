 import java.util.Scanner;
 public class Periodo {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char turno;

         System.out.println("Entre com o pedido do dia: \n M = manhã \n V = vespertino \n N = noite");
         turno = ler.next().charAt(0);

         if (turno == 'm' || turno =='M'){
           System.out.println("Bom dia");
           }  
           else if ( turno == 'v' || turno == 'v'){
           System.out.println("Boa tarde");
           }
           else if  ( turno == 'n' || turno == 'N'){
           System.out.println("Boa noite");
           }
           else{
             System.out.println("Período do dia inválido.");
           }
         ler.close();
    }
}