import java.util.Scanner;

public class ClassificadorDeIdade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        int idade = ler.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Classificação: Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Classificação: Adulto");
        } else if (idade >= 60) {
            System.out.println("Classificação: Idoso");
        } else {
           
            System.out.println("Idade inválida.");
        }

        ler.close();
    }
}
