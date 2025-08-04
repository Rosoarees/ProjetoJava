import java.util.Scanner;

public class TabuadaComVetor {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int tamanhoVetor = 10;
        int[] tabuada = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            tabuada[i] = i + 1;
        }
        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = ler.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(numero + " x " + tabuada[i] + " = " + (numero * tabuada[i]));
        }

        ler.close();
    }
}