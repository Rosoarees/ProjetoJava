import java.util.ArrayList;

public class ListaNumeros {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(8);
        numeros.add(10);
        
     
        System.out.println("Tamanho da lista: " + numeros.size());
        numeros.remove(Integer.valueOf(8));
        System.out.println("Primeiro número da lista: " + numeros.get(0));
        
        System.out.println("Lista atual: " + numeros);
    }
}