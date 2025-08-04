public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        // Correções principais:
        // 1. Declaração das variáveis de loop (i e j)
        // 2. Uso de matriz[i].length para o loop interno
        // 3. Remoção da vírgula extra no final
        // 4. Troca de System.err para System.out
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}