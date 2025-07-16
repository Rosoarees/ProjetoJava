import java.util.Scanner;
public class Exercicio17 {
   
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario, bonus;

        System.out.print("digite o valor do seu salário");
        salario = ler.nextDouble();

        if(salario >= 2000){
            bonus = salario * 1.1;
            System.out.print(" o valor do salário final é r$" +bonus);
        }
        else if (salario < 2000){
            bonus = salario * 1.15;
            
             System.out.print(" o valor do salário final é r$" +bonus);
        }
        else {
             System.out.print("você digitou um valor inválido!"); 
        }
        ler.close();
     }
}
