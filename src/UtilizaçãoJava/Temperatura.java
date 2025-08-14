import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double temperatura;
        char modelo;

        System.out.print("Digite F para Fahrenheit e C para Celsius: ");
        modelo = ler.next().charAt(0);

        System.out.print("Digite uma temperatura a ser convertida: ");
        temperatura = ler.nextDouble();

        if (modelo == 'f' || modelo == 'F') {
            // Converte Fahrenheit para Celsius: C = (F - 32) / 1.8
            double celsius = (temperatura - 32) / 1.8;
            System.out.printf("A temperatura convertida para Celsius: %.2f°C\n", celsius);
        } 
        else if (modelo == 'c' || modelo == 'C') {
            // Converte Celsius para Fahrenheit: F = (C * 1.8) + 32
            double fahrenheit = (temperatura * 1.8) + 32;
            System.out.printf("A temperatura convertida para Fahrenheit: %.2f°F\n", fahrenheit);
        } 
        else {
            System.out.println("Opção inválida! Use 'F' ou 'C'.");
        }
    }
}