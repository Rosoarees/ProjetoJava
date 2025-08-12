// FormaGeometrica.java
public abstract class FormaGeometrica {
    public  String cor;
    public FormaGeometrica(String cor) {
        this.cor = cor;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public void imprimirDetalhes() {
        System.out.println("\n=== Detalhes da Forma ===");
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}