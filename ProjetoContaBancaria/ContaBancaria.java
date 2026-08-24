package ProjetoContaBancaria;

public class ContaBancaria {
    String titular;
    String numeroConta;

    //saldo zero por padrao, mas poderia ser passado como parametro
    double saldo = 0.0;

    // construtor padrao
    public ContaBancaria() {
    }

    //sem saldo pois é zero por padrao, mas poderia ser passado como parametro
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;

    }
    //void é o metodo a ser criado, depositar é o nome do metodo e double valor é o parametro que sera passado para o metodo
    void depositar(double valor) {
        if (valor < 0)
            System.out.println("Valor invalido");
        else
        saldo = saldo + valor;
    }
    void sacar(double valor) {
        if (saldo < 0)
            System.out.println("Saldo insuficiente");
        
        else if (valor > saldo) {
            System.out.println("Valor do saque maior que o saldo");
        }
        else {
            saldo = saldo - valor;
        }
    }
    void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria [titular=" + titular + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", toString()=" + super.toString() + "]";    
    }

    
}
