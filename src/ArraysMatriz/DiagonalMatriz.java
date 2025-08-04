public class DiagonalMatriz {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int numeroDeLinhas = matrizOriginal.length;
        int numeroDeColunas = matrizOriginal[0].length;
        int[][] matrizTransposta = new int[numeroDeColunas][numeroDeLinhas];
        
        for (int linha = 0; linha < numeroDeLinhas; linha++) {
            for (int coluna = 0; coluna < numeroDeColunas; coluna++) {
                matrizTransposta[coluna][linha] = matrizOriginal[linha][coluna];
            }
        }
        
        System.out.println("Matriz Original:");
        for (int linha = 0; linha < numeroDeLinhas; linha++) {
            for (int coluna = 0; coluna < numeroDeColunas; coluna++) {
                System.out.print(matrizOriginal[linha][coluna] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz Transposta:");
        for (int linha = 0; linha < numeroDeColunas; linha++) {
            for (int coluna = 0; coluna < numeroDeLinhas; coluna++) {
                System.out.print(matrizTransposta[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}