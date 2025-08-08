public class Exemplo {
    public static void main(String[] args) {
        String[] biscoitos = {"chocolate", "Maisena", "Leite"};
        
        try {
            System.out.println("Pegando o biscoito na posição 3...");
            System.out.println("Biscoito de " + biscoitos[3]); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não existe biscoito na posição 3, verifique sua escolha");
            
        } finally {
            System.out.println("Fechando o pote de biscoito");
        }
    }
}