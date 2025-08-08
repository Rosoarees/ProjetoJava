public class AcessoArray {
    public static void main(String[] args) {
        String[] nomes = {"Joana", "Jose", "Maria"};
        
        try {
           
            System.out.println("Nome na posição 5: " + nomes[5]);
           
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Posição Inválida!");
             System.out.println("Não existe posição 5!");

        } finally {
             System.out.println("Só existe 3 elementos na lista ");
        }
    }
}