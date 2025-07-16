import java.util.Scanner;


public class DiaDaSemanaIfElse {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numeroDia = leitor.nextInt();

        String nomeDoDia;

    
        if (numeroDia == 1) {
            nomeDoDia = "Domingo";
        }
        else if (numeroDia == 2) {
            nomeDoDia = "Segunda-feira";
        }
        else if (numeroDia == 3) {
            nomeDoDia = "Terça-feira";
        }
        else if (numeroDia == 4) {
            nomeDoDia = "Quarta-feira";
        }
        else if (numeroDia == 5) {
            nomeDoDia = "Quinta-feira";
        }
        else if (numeroDia == 6) {
            nomeDoDia = "Sexta-feira";
        }
        else if (numeroDia == 7) {
            nomeDoDia = "Sábado";
        }

        else {
            nomeDoDia = "Dia inválido";
        }

       
        System.out.println(nomeDoDia);

      
        leitor.close();
    }
}