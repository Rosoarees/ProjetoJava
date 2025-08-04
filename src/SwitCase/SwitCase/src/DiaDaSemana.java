import java.util.Scanner;
public class Exercicio2 {
     public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        int dia;

        System.out.print("\n n1 digite 1 p/ domingo \n digite 2 p/ segunda-feira \n digite 3 p/ terça-feira \n digite 4 p/quarta-feira \n digite 5 p/ quinta-feira \n digite 6 para sexta-feira \n digite 7 p/ sábado ");
        dia = ler.nextInt();

        switch (dia) {
            case 1:
            
            System.out.println("domingo");
            break;
             case 2:
            
            System.out.println("segunda-feira");
            break;
             case 3:
            
            System.out.println("terça-feira");
            break;
             case 4:
            
            System.out.println("quarta-feira");
            break;
             case 5:
            
            System.out.println("quinta-feira");
            break;
             case 6:
            
            System.out.println("sexta-feira");
            break;
             case 7:
            
            System.out.println("sábado");
            break;
            default:
             System.out.println("você digitou um número inválido!");
        }
        ler.close();
     }
}

