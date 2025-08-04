import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha = "java123";
        String confirmar;

        do { 
            System.err.println("Digite sua senha:");
            confirmar = ler.nextLine();

            
            
        } while (!senha.equals(confirmar));
        System.err.println("Senha válida, você tem acesso ao sistema: ");
        ler.close();

    }
}