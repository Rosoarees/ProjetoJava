import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[4];
        int i;
        double total = 0;

        for (i = 0; i < 4; i++) {
            System.out.print("Digite uma note: ");
            notas[i] = ler.nextDouble();
            total += notas[i];
           
        }
         System.out.println("Sua primeira nota é: "+notas[i]);

         ler.close();
      
}
}
