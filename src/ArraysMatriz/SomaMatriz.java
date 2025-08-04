public class SomaMatriz {
    public static void main(String[] args) {
        // Matriz 2x2
        int[][] matriz = {{1, 2}, {1, 2}};
        int soma = 0;
        
        // Percorre cada linha da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            
            // Percorre cada coluna da linha atual
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma = soma + matriz[linha][coluna];  // Soma o elemento atual
            }
        }
        
        System.out.println("Resultado da soma: " + soma);
    }
}