import java.util.Scanner;
public class Exercicio4 {
     public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int nota;

        System.out.print("digite uma nota de 0 á 10:");
        nota = ler.nextInt();

          switch (nota) {
            case 10:
            case 9:
            System.out.println("nota 'A'");
            break;
             case 8:
            case 7:
            System.out.println("nota 'B'");
            break;
             case 6:
            case 5:
            System.out.println("nota 'C'");
            break;
             case 4:
            case 3:
            System.out.println("nota 'D'");
            break;
             case 2:
            case 0:
            System.out.println("nota 'E'");
            break;
             default:
             System.out.println("você digitou um número inválido!");
          }
          ler.close();
     }
    
}
