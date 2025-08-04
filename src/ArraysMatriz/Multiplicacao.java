public class Multiplicacao {
    public static void main(String[] args) {
        
        int multiplicacao = 1;
        int i, j;
        int[][] matriz = {
            {1, 2}, 
            {1, 2}
        };

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                multiplicacao *= matriz[i][j];
            }
        }

        System.out.println("Multiplicação dos elementos: " + multiplicacao);
    }
}
