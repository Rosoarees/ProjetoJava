public class Quadrado extends FormaGeometrica{
    public double largura;
    public double altura;
    public Quadrado(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}