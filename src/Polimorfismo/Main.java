class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }

    public String somar(String a, String b){
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(5, 3));        
        System.out.println(calc.somar(5, 3, 2));    
        System.out.println(calc.somar(5.5, 3.5));    
        System.out.println(calc.somar("Olá, ", "Mundo!")); 
    }
}