public class Gerente extends Funcionario {
    @Override
    
            public void CalcularSalario () {
        double salario =  8157.41;
        double inss = 0.14;
        double desconto = salario*inss;

        System.out.println( "O Gerente vai receber o, "+(salario-desconto));
    }
}


