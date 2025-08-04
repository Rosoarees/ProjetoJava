import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        long i, base, expoente, resultado;
      
        System.out.print("Digite o numero: ");
        base = ler.nextInt();
        
        System.out.print("Digite o seu expoente: ");
         expoente = ler.nextInt();
        resultado = base;
        
        for( i =1;i < expoente; i++ ) {
            resultado *= base;
            System.out.println("Resultado");
           
        }
        
        ler.close();
      
    }
}