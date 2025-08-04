
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contador = 0;
        int tabuada, resultado;
        char saida = 's';

        while (saida != 's' || saida !='S'){
            System.out.print("Digite um numero, para visualizar sua tabua: ");
            tabuada = ler.nextInt();

            do { 
                resultado = tabuada*contador;
            System.out.println(contador+ "x"+tabuada+" = "+resultado);
            contador++;
                
            } while (contador <=10);
                System.out.print("Digita s para continuar e n para sair:");
                contador= 0;
                saida = ler.next().charAt(0);

            
            ler.close();
        }
        
    }
    
}
