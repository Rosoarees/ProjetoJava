import java.util.Scanner;

public class CalculadoraPesoIdeal {

    public static void main(String[] args) {

     
        Scanner ler = new Scanner(System.in);

     
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = leitor.nextDouble();

       
        System.out.print("Digite seu sexo ('M' para masculino ou 'F' para feminino): ");
     
        char sexo = leitor.next().toUpperCase().charAt(0);

        double pesoIdeal;

     
        if (sexo == 'M') {
           
            pesoIdeal = (72.7 * altura) - 58;
         
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else if (sexo == 'F') {
           
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else {
           
            System.out.println("Entrada de sexo inválida. Por favor, digite 'M' ou 'F'.");
        }

     
        ler.close();
    }
}