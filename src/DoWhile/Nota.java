import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota, media;
        float total = 0;
        int contador = 0;

        do {
            System.out.print("Entre com a nota (digite 0 para sair):");
            nota = ler.nextFloat(); 
            
            if(nota >= 0 && nota <= 10) {
                contador++;
                total += nota;
            }
            
        } while (nota >= 0); 
        
        if(contador > 0) {
            media = total / contador;
            System.out.println("Sua média é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        
        ler.close();
    }
}
