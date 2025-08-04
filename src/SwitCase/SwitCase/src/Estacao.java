import java.util.Scanner;
public class Exercicio6 {
     public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int num;

         System.out.print("digite um numero de 1 á 4");
        num = ler.nextInt();

        switch (num) {
            case 1:
            
            System.out.println("verão");
            break;
             case 2:
            
            System.out.println("outono");
            break;
             case 3:
            
            System.out.println("inverno");
            break; 
             case 4:
            
            System.out.println("primavera");
            break;
              default:
             System.out.println("você digitou um número inválido!");
          
          ler.close();

        }
     }
    
}
