import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorDeNumeros {

    public static void main(String[] args) {

     
        Scanner leitor = new Scanner(System.in);

       
        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = leitor.nextDouble();

        double[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: ");
     
        System.out.println(numeros[0]);
     
        System.out.println(numeros[1]);
       
        System.out.println(numeros[2]);

       

       
        leitor.close();
    }
}
