import java.util.Scanner;

public class Busca {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String [] nomes = {"Ana", "João", "Maria", "maria", "Carlos", "Beatriz"};
        String busca;
        boolean encontro = false;
        int i;

        System.out.print("Entre com um nome para ser verificado: ");
        busca = ler.nextLine();

        for (i =0; i <nomes.length; i++){
            if (nomes[i] == null ? busca == null : nomes[i].equals(busca)) {
                encontro = true;
                break;
            }
        }

        System.out.println(encontro ? "Achou" : "Não achou!");
        ler.close();
    }
}
