import java.util.Scanner;
public class Operacao {
     public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    int num1, num2, selecao, resultado;
    
     System.out.print("digite o primeiro número:");
    num1 = ler.nextInt();
     System.out.print("digite o segundo número:");
    num2 =  ler.nextInt();
     System.out.print("digite o número correspondente a operação matemática:\n 1. adição \n 2. subtração \n 3.multiplicação\n 4. divisão \n --->");
    selecao = ler.nextInt();

    if ( selecao == 1){
         resultado = num1 + num2;
         System.out.println(num1 +"+" +num2+ "=" +resultado);
    }else if (selecao == 1){
        resultado = num1 - num2;
         System.out.println(num1 + "-" +num2+ "=" +resultado);

    }else if (selecao == 1){
        resultado = num1 * num2;
         System.out.println(num1 + "*" +num2+ "=" +resultado);
 
        resultado = num1 / num2;
         System.out.println(num1 + "/" +num2+ "=" +resultado);
 
    }else {
         System.out.print("0peração inválida.");
    }
    ler.close();
}
}