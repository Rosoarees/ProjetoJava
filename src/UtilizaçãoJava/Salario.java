public class Salario {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);
        double salario, bonus;

        System.out.print("Digite o valor do seu salário");
        salario = ler.nextDouble();

        if (salario >= 2000) {
            bonus = salario * 1.1;
            System.out.println("O valor do salário final é R$ "+bonus);
        }
        else if (salario < 2000) {
            bonus = salario * 1.1;
             System.out.println("O valor do salário final é R$ "+bonus);
        }
        else {
             System.out.println("Você digitou um valor invalido");
        }
        ler.close();

    }

}
