import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int numero;
        
        System.out.print("Digite um número inteiro positivo: ");
        numero = ler.nextInt();
        
        
        while (numero < 0) {
            System.out.print("Por favor, digite um número positivo: ");
            numero = ler.nextInt();
        }
        
        while (contador <= numero) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }
        
        System.out.println("A soma dos números pares de 0 até " + numero + " é: " + soma);
        ler.close();
    }
}
