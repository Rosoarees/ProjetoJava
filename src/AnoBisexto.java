import java.util.Scanner;

public class AnoBisexto {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano, verificar;

        System.out.println("Digite o ano em que deseja consultar:");
        ano = ler.nextInt();

        verificar = ano % 4;

        if (verificar == 0){
            System.out.println("0 ano "+ano+" é bissexto"); 
        }
        else if (verificar != 0){
           System.out.println("0 ano "+ano+" é um ano comum!");
        }
        else {
             System.out.println("NÃO É UM ANO VÁLIDO! ");
        }
        ler.close();

    }
}