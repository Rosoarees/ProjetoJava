public class MultiplicaMatrizes {
    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] matrizB = {{7, 8}, {9, 10}, {11, 12}}; 
        int[][] resultado = new int[2][2]; 

      
        for (int i = 0; i < matrizA.length; i++) { 
            for (int j = 0; j < matrizB[0].length; j++) { 
                for (int k = 0; k < matrizA[0].length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

       
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}