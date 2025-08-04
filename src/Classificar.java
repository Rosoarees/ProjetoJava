import java.util.Scanner;
public class Classificar {
     public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    System.out.print("digite sua idade:");
     int idade = ler.nextInt();
     if (idade >=0 && idade <=12){ 
         System.out.print("classificação criança.");
     }else if (idade >=13 && idade <=17){
        System.out.print("classificação adolescente."); 
     }else if (idade >=18 && idade <=59){
         System.out.print("classificação adulto."); 
     }else if (idade >=60){
         System.out.print("classificação idoso."); 
     }else {
        System.out.print("idade inválida."); 
     }
     ler.close();
}
}