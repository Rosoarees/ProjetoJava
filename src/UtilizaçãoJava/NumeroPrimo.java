public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int primo, resto;

        System.out.println("VERIFICAÇÃO DE NÚMEROS PRIMOS!!!!");
        System.out.print("Digite um número para ser verificado:");
        primo = ler.nextInt();


        if (primo == 1 || primo == 2 || primo == 3 || primo == 5 || primo == 7) {
            System.out.println("É um número primo!!!!");
        }
        else {
            System.out.println("Não é um número primo!!!");
        }

    
   }
}
