import java.util.Scanner;
public class Letra {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        char letras;

        System.out.print("digite a letra minuscula a ser verificada:");
        letras = ler.next().charAt(0);

        if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u'){
            System.out.println("A letra é uma vogal!");

        }else if (letras >= 'a' && letras <= 'z') {
            System.out.println("A letra é uma consoante!");
        }
        else {
             System.out.println("Erro, a letra é maiuscula!");
        }
        ler.close();
    }
}
