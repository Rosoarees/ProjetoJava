import java.util.Scanner;

public class SaudacaoPorTurnoIfElse {

    public static void main(String[] args) {

     
        Scanner ler = new Scanner(System.in);

     
        System.out.print("Digite o seu turno ('M' para matutino, 'V' para vespertino ou 'N' para noturno): ");

       
        char turno = ler.next().toUpperCase().charAt(0);

     
        if (turno == 'M') {
            System.out.println("Bom dia!");
        }
       
        else if (turno == 'V') {
            System.out.println("Boa tarde!");
        }
       
        else if (turno == 'N') {
            System.out.println("Boa noite!");
        }
     
        else {
            System.out.println("Turno inválido.");
        }

       
        ler.close();
    }
}
