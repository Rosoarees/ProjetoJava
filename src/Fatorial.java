public class Fatorial {
    public static void main(String[] args) {
        int N = 7;
        int fatorial = 1; 
        
        for(int i = 1; i <= N; i++) {
            fatorial *= i; 
        }
        
        System.out.println("O fatorial de " + N + " é: " + fatorial);
    }
}