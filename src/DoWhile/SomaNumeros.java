import java.util.Scanner;

public class SomaNumeros {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 double numero;
double soma = 0;

System.out.println("=== SOMADOR DE NÚMEROS ===");
System.out.println("Digite números para somar (0 para parar):");

do {
 System.out.print("Digite um número: ");
numero = scanner.nextDouble();
 soma += numero; 
System.out.println("Soma total: " + soma);
 ler.close();
}