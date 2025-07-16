

import java.util.Scanner;

public class SignoPorMesIfElse {

    public static void main(String[] args) {

   
        Scanner leitor = new Scanner(System.in);

      
        System.out.print("Digite o número do seu mês de nascimento (1 a 12): ");

   
        int mes = leitor.nextInt();


        if (mes == 1) {
            System.out.println("Signo provável: Capricórnio");
        }
        else if (mes == 2) {
            System.out.println("Signo provável: Aquário");
        }
        else if (mes == 3) {
            System.out.println("Signo provável: Peixes");
        }
        else if (mes == 4) {
            System.out.println("Signo provável: Áries");
        }
        else if (mes == 5) {
            System.out.println("Signo provável: Touro");
        }
        else if (mes == 6) {
            System.out.println("Signo provável: Gêmeos");
        }
        else if (mes == 7) {
            System.out.println("Signo provável: Câncer");
        }
        else if (mes == 8) {
            System.out.println("Signo provável: Leão");
        }
        else if (mes == 9) {
            System.out.println("Signo provável: Virgem");
        }
        else if (mes == 10) {
            System.out.println("Signo provável: Libra");
        }
        else if (mes == 11) {
            System.out.println("Signo provável: Escorpião");
        }
        else if (mes == 12) {
            System.out.println("Signo provável: Sagitário");
        }

        else {
            System.out.println("Mês inválido. Por favor, digite um número entre 1 e 12.");
        }

        System.out.println("\nLembrete: Esta é uma simplificação. O signo exato depende do dia do nascimento.");

       
        leitor.close();
    }
}