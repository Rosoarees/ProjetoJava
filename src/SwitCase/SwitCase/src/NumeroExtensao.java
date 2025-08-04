import java.util.Scanner;
public class Exercicio5 {
     public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("digite um número de 1 á 5:");
        num = ler.nextInt();

         switch (num) {
            case 1:
            
            System.out.println("um");
            break;
             case 2:
            
            System.out.println("dois");
            break;
             case 3:
            
            System.out.println("três");
            break; 
             case 4:
            
            System.out.println("quatro");
            break;
              case 5:
            
            System.out.println("cinco");
            break;
         
          default:
             System.out.println("você digitou um número inválido!");
          
          ler.close();

        }
    }
}
