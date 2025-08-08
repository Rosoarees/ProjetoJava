import java.util.ArrayList;

public class Compras {
    public static void main(String[] args) {
      
        ArrayList<String> listaDeCompras = new ArrayList<>();
        
       
        listaDeCompras.add("Maçãs");
        listaDeCompras.add("Banana");
        listaDeCompras.add("Leite");
        
        listaDeCompras.remove("Maçãs");
        
        String primeiroItem = listaDeCompras.get(0);
        
        System.out.println("Primeiro item atual: " + listaDeCompras.get(0));
        System.out.println("Item armazenado: " + primeiroItem);
        
       
        System.out.println("Total de itens: " + listaDeCompras.size());
    }
}