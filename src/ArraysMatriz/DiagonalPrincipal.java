public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 1, 6}, {7, 8, 1}};
        boolean diagonalIgual = true;
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            if (matriz[i][i] != matriz[0][0]) {
                diagonalIgual = false;
                break;
            }
        }
        System.out.println("Diagonal principal é igual? " + diagonalIgual);
    }
}