import java.util.Scanner;
public class Exercicio6 {
     public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    int dia;
    System.out.print("digite um número de 1 á 7");
     dia = ler.nextInt();

     if (dia == 1){
        System.out.print("domingo");
     }else if (dia == 2){
         System.out.print("segunda-feira");
     }else if (dia == 3){
         System.out.print("terça-feira");
     }else if (dia == 4){
         System.out.print("quarta-feira");
     }else if (dia == 5){
         System.out.print("quinta-feira");
     }else if (dia == 6){
         System.out.print("sexta-feira");
     }else if (dia == 7){
         System.out.print("sábado");
     }else {
         System.out.print("dia inválida.");
     }
     ler.close();

    
}
}