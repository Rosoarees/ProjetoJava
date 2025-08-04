public class Contador {
    public static void main(String[] args) {
        int contador, valor1, resultado;
        int valor2 = 0;
        int total = 0;
        
        for(contador = 0; contador <= 100; contador++) {
            valor1 = contador;
            valor2 = valor1;
            resultado = valor2;
            total += resultado;
            
            System.out.println("Contador: " + contador + " | Resultado: " + resultado);
        }
        
        System.out.println("Total acumulado: " + total);
    }
}