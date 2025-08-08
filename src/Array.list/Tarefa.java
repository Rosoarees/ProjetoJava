import java.util.ArrayList;

public class Tarefa {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        boolean temAlgo;
        String segundoItem;

        tarefas.add("Estudar java");
        tarefas.add("Ler livro");
        tarefas.add("Fazer exercícios");
       
        segundoItem = tarefas.get(1);  
        tarefas.remove("Estudar java");
        temAlgo = tarefas.contains("Ler livro");  

        System.out.println("Contém 'Ler livro'? " + temAlgo);
        System.out.println("Segundo item da lista: " + segundoItem);
        System.out.println("Lista completa: " + tarefas);
    }
}