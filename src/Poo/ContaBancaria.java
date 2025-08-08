public class ContaBancaria {
    // Atributos (Características)
    String titular;
    int numero;
    double saldo;
    boolean ativa;
    
    // Métodos (Comportamentos/Ações)
    
    // 1. Ativar/Desativar Conta
    public void ativar() {
        if (this.ativa) {
            System.out.println("A conta já está ativa!");
        } else {
            this.ativa = true;
            System.out.println("Conta ativada com sucesso.");
        }
    }
    
    public void desativar() {
        if (!this.ativa) {
            System.out.println("A conta já está desativada!");
        } else {
            this.ativa = false;
            System.out.println("Conta desativada com sucesso.");
        }
    }
    
    // 2. Operações Bancárias
    public void depositar(double valor) {
        if (!this.ativa) {
            System.out.println("Erro: Conta desativada. Operação não permitida.");
        } else if (valor <= 0) {
            System.out.println("Erro: Valor de depósito inválido.");
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
        }
    }
    
    public void sacar(double valor) {
        if (!this.ativa) {
            System.out.println("Erro: Conta desativada. Operação não permitida.");
        } else if (valor <= 0) {
            System.out.println("Erro: Valor de saque inválido.");
        } else if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
        }
    }
    
    // 3. Verificar Estado da Conta
    public void verificarSaldo() {
        System.out.println("----- Extrato Bancário -----");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo Disponível: R$" + this.saldo);
        System.out.println("Status: " + (this.ativa ? "Ativa" : "Desativada"));
        System.out.println("----------------------------");
    }
    
    // Método main para testar (igual no exemplo da caneta)
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João Silva";
        conta.numero = 12345;
        conta.saldo = 1000.0;
        conta.ativa = true;
        
        // Testando os métodos
        conta.verificarSaldo();  // Mostra estado inicial
        
        conta.depositar(500);    // Deposita 500
        conta.sacar(200);        // Saca 200
        conta.desativar();       // Tenta desativar
        conta.sacar(100);        // Tenta sacar com conta desativada
        conta.ativar();          // Reativa a conta
        conta.verificarSaldo();  // Mostra estado final
    }
}