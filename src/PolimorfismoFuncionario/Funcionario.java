public class Funcionario {
    

    public void CalcularSalario () {
        double salario = 1518.00;
        double inss = 0.075;
        double desconto = salario*inss;

        System.out.println( "O funcionário vai receber o, "+(salario-desconto));
    }
}

    
