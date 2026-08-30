public class Pedido {

    String produto;
    double preco;
    int quantidade;
    Cliente cliente;

    // Construtor padrão
    public Pedido() {

    }

    // Construtor carregado
    public Pedido(String produto, double preco, int quantidade, Cliente cliente) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cliente = cliente;
    }

    // Método com lógica
    public double calcularTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Pedido [produto=" + produto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", cliente=" + cliente.nome + "]";
    }
}