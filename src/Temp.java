import java.util.Scanner;

public class Temperatura {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

        double temperatura, farenheit, celsius;
        char modelo;

        System.out.print("digite F para farenheit e C para celsius:");
        modelo = ler.next().charAt(0);

         System.out.print("digite uma temperatura a ser convertida:");
         temperatura = ler.nextDouble();

         if (modelo == 'f' || modelo == 'F') {
            farenheit = (temperatura * 1.8)+32;
           System.out.println("a temperatura convertida para farenheit é "+farenheit+"°f");
         }
        else if  (modelo == 'c' || modelo == 'C'){
          celsius = (temperatura -32)/1.8;
           System.out.println("a temperatura convertida para celsius é "+celsius+"°c");
         }
        else {
           System.out.println("você digitou uma temperatura inválida.");
         
        } 
        ler.close();
    }
}
