import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.print("Digite o primeiro lado do triângulo:");
        lado1 = ler.nextInt();

        System.out.print("Digite o segundo lado do triângulo:");
        lado2 = ler.nextInt();

        System.out.print("Digite o terceiro lado do triângulo:");
        lado3 = ler.nextInt();

        // Verifica se é um triângulo válido (soma de dois lados > terceiro)
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Verifica o tipo do triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero (todos os lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.print("O triângulo é Isósceles (dois lados iguais).");
            } else {
                System.out.print("O triângulo é Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.print("Os lados fornecidos não formam um triângulo válido!");
        }
    }
}