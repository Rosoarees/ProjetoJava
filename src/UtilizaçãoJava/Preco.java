import java.util.Scanner;
public class Preco {
   
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int codigo;
        System.out.print("Dgite o código do lanche: \n 1. bauru \n 2. misto quente \n 3. cachorro quente \n 4. pão na chapa \n 5. x-salada \n ----------->");
        codigo =  ler.nextInt();

        if(codigo == 1){
            System.out.println("você escolheu o bauru, que custa $ 7,00");
        }
        else if (codigo == 2){
            System.out.println("você escolheu o misto quente, que custa $ 10,00"); 
        }
         else if (codigo == 3){
            System.out.println("você escolheu o cachorro quente, que custa $ 12,00"); 
        }
         else if (codigo == 4){
            System.out.println("você escolheu o pãona chapa, que custa $ 4,00"); 
        }else if (codigo == 5){
            System.out.println("você escolheu o x-salada, que custa $ 15,00"); 

        }
        else{
            System.out.println("você escolheu o número inválido."); 
        }
        ler.close();

        }

}
