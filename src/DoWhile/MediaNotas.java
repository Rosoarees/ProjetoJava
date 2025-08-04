
import java.util.Scanner;

public class MediaNotas {
 public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
double nota;
double soma = 0;
int quantidade = 0;

System.out.println("=== CALCULADORA DE MÉDIA ===");
 System.out.println("Digite as notas (0-10) ou um número negativo para sair:");

 while (true) {
 System.out.print("Digite a nota: ");
nota = ler.nextDouble();


if (nota < 0) {
break;
}


if (nota > 10) {
 System.out.println("Nota inválida! Digite valores entre 0 e 10.");
continue;
}

 soma += nota;
quantidade++;
}


 if (quantidade > 0) {
 double media = soma / quantidade;
System.out.printf("Média das notas: %.2f\n", media);
} else {
 System.out.println("Nenhuma nota válida foi inserida.");
}

ler.close();
}
} 
    

