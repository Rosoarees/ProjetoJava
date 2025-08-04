import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int atual = 1;
        int anteriror = 1;
        int sobra, i;
        
    
        for (i = 1; i <= 10; i++) {
            System.out.print(atual);
            
            sobra = atual;
            atual += anteriror;
            anteriror = sobra;
        
       
    }
}

}