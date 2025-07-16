import java.util.Scanner;
public class Exercicio4 {
     public static void main(String[]args){

       var entrada = new Scanner(System.in);
        double n1,n2,n3,n4,resultado;
         System.out.print("Primeiro  número");
        n1 = entrada.nextDouble();
         System.out.print("Segundo  número");
        n2 = entrada.nextDouble();
         System.out.print("Terceiro número");
        n3 = entrada.nextDouble();
         System.out.print("Quarto número");
        n4 = entrada.nextDouble();
        resultado = (n1+n2+n3+n4)/4;
        System.out.println(n1+ "+" +n2+ "+" +n3+ "+" +n4+ "/4 =" +resultado);
        if( resultado >= 7){
            System.out.println("Aprovado com a média "+resultado);
        }else if (resultado < 65 ){
            System.out.println("Reprovado com a média "+resultado);
        }else{
              System.out.println("O aluno esta de recuperação com a média  " +resultado);
        }
        entrada.close();
    }

}

