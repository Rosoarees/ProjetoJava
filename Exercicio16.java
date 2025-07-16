import java.util.Scanner;
public class Exercicio16 {
    
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3;


        System.out.print("digite o número do primeiro lado:");
        lado1 = ler.nextInt();
        System.out.print("digite o número do segundo lado:");
        lado2 = ler.nextInt();
        System.out.print("digite o número do terceiro lado:");
        lado3 = ler.nextInt();

        if(lado1 == lado2 && lado1 == lado3) {
          System.out.println("o triângulo é equilátero! ");
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
          System.out.println("o triângulo é escaleno! ");
        }
        else {
            System.out.println("o triângulo é isósceles!");

        }
        ler.close();

        

    

     }
}
