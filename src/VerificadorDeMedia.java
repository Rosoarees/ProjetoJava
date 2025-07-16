import java.util.Scanner;

public class VerificadorDeMedia {

    public static void main(String[] args) {

     
        Scanner leitor = new Scanner(System.in);

     
        System.out.print("Digite a média do aluno (de 0 a 10): ");

       
        double media = leitor.nextDouble();

       
        if (media >= 7.0 && media <= 10.0) {
           
            System.out.println("Situação: Aprovado");
        } else if (media >= 5.0 && media < 7.0) {
         
            System.out.println("Situação: Recuperação");
        } else if (media >= 0 && media < 5.0) {
 
            System.out.println("Situação: Reprovado");
        } else {

            System.out.println("Média inválida. Por favor, digite um valor entre 0 e 10.");
        }

        leitor.close();
    }
}