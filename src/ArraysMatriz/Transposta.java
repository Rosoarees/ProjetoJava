public class Transposta { 
    public static void main(String[] args) { 
        int[][] original = {
            {1, 2, 3}, 
            {4, 5, 6}
        }; 
        
        int[][] transposta = new int[3][2]; 
        
       
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                transposta[j][i] = original[i][j];
            }
        }

       
        System.out.println("Matriz transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    } 
}
