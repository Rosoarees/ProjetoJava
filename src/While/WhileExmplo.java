import java.util.Scanner;


public class WhileExmplo {
    public static void main(String[] args) throws Exception {

        int num1 = 0;
        int num2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digiete um nemro para iniciar a contagem:");
        num2 = ler.nextInt();

        while (num2 == num1) {

            System.out.println("Contando regressiva ->"+num1);
            num1 -= 1;
        }
        
        
    }
}