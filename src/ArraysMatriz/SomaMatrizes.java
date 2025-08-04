public class SomaMatrizes { 
    public static void main(String[] args) { 
        int[][] matrizA = {{1, 2}, {3, 4}}; 
        int[][] matrizB = {{5, 6}, {7, 8}}; 
        int[][] resultado = new int[2][2]; 

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
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