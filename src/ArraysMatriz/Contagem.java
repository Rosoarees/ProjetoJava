import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        int linha, coluna;
        int [][] matriz = {
            {83, 85, 8},
            {04, 17, 1},
            {07, 06, 12}
        };
        for (i =0; i <matriz.length; i++) {
            for (j = 0; j <matriz.length; j++) {
                System.out.println(matriz[i][j]+"");
            }
            System.out.println();
        }

        System.out.println("Verificando a matriz apresentada acima,\n escolha a linha que deseja imprimir: (1 = 1ª, 2 = 2ª, 3 = 3ª)");
        linha = ler.nextInt();

        System.out.println("Verificando a matriz apresentada acima,\n escolha a coluna que deseja imprimir: (1 = 1ª, 2 = 2ª, 3 = 3ª)");
        coluna = ler.nextInt();
        System.out.print("Você escolheu o valor: "+matriz[(linha-1)][(coluna-1)]);

    }
}
