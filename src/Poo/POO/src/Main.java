public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo("vermelho", 5.0);
        FormaGeometrica retangulo = new Retangulo("azul", 4.0, 6.0);
        FormaGeometrica quadrado = new Retangulo("verde", 4.0, 4.0);
        
        System.out.println("=== Detalhes do Círculo ===");
        circulo.imprimirDetalhes();
        
        System.out.println("\n=== Detalhes do Retângulo ===");
        retangulo.imprimirDetalhes();

        System.out.println("\n=== Detalhes do Quadrado ===");
        quadrado.imprimirDetalhes();
    }
}