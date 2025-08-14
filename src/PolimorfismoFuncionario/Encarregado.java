public class Encarregado extends Funcionario {
    @Override

        public void CalcularSalario () {
        double salario =  2793.88;
        double inss = 0.09;
        double desconto = salario*inss;

        System.out.println( "O Encarregado vai receber o, "+(salario-desconto));
    }
}


