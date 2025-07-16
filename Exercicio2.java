
    

import java.util.Scanner;
public class Exercicio2 {


public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        double n1,n2;
        System.out.print("primeiro numero");
        n1 = ler.nextDouble();

        System.out.print("segundo número");
        n2 = ler.nextDouble();
        
        
        if (n1 > n2){
            System.out.println(n1 +"é mairo que" +n2);

        }else if (n1 < n2){
             System.out.println(n2 +" é maior que "+n1);


        }else {
             System.out.println("os números são iguais");
        }

        ler.close();


    }
}