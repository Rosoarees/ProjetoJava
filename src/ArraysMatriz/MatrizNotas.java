public class MatrizNotas {
    public static void main(String[] args) {
        double soma, media;
        int i, j;
        double[][] notas = {{8.5, 7.9, 3.9}, {5.8, 6.9, 3.0}, {9.0, 8.6, 8.0}};
        for (i = 0; i<notas.length; i++) {
            soma = 0;
            for (j = 0; j<notas.length; i++) {
                soma += notas[i][j];
            }
            media = soma / notas[i].length;
            System.out.println("O aluno teve a média"+media);

        }
    }
    
}
