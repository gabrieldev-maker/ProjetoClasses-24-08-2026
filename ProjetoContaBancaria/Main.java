package ProjetoContaBancaria;

public class Main {
    public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria("Joao", "1234");
        conta1.depositar(100.00);
        conta1.mostrarSaldo();
        conta1.sacar(150);
        conta1.mostrarSaldo();
}
}
