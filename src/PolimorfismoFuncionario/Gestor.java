public class Gestor extends Funcionario {


    @Override
        
            public void CalcularSalario () {
        double salario =  8157.41;
        double inss = 0.12;
        double desconto = salario*inss;

        System.out.println( "O Gestor vai receber o, "+(salario-desconto));
    }
}

