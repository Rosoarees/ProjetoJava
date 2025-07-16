import java.util.Scanner;
public class Exercicio10 {
   
     public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int num1, num2, num3;
        System.out.print("entre com o primeiro número:");
        num1 = ler.nextInt();
        System.out.print("entre com o segundo número:");
        num2 = ler.nextInt();
        System.out.print("entre com o terceiro número:");
        num3 = ler.nextInt();
        
        if(num1 > num2){
            if(num2 >= num3){
                System.out.println(num1+ ", "+num2+" ,"+num3);
            }
            else if (num2 < num3){
               System.out.println(num1+ ", "+num3+" ,"+num2);  
            }
            else {
               System.out.println("você digitou números incoerentes:");  

            }
        } 

        else if(num2 > num1){
        if(num1 > num3){
            System.out.println(num2+ "," +num1+ ","+num3);  
        }
        else if (num2 < num3){
            System.out.println(num2+ "," +num3+ ","+num1);   
        }
        else{
            System.out.println("você digitou números incoerentes:");  

        }
    }
    else if (num3 > num1){
        if(num1 > num2){
            System.out.println(num3+ "," +num1+ ","+num2);     
        }
        else if (num1 < num2){
            System.out.println(num3+ "," +num2+ ","+num1);     
        }
        else{
            System.out.println("você digitou números incoerentes:");  
  
        }
    }
    else{
        System.out.println("Você digitou valores incoerentes.");
    }
    ler.close();

    }
}