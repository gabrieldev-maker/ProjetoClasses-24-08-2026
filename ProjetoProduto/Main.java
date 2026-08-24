public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.nome = "Arroz";
        prod1.codigo = "0-123";
        prod1.preco = 5.00;
        prod1.quantidadeEstoque = 100;

        Produto prod2 = new Produto();
        prod2.nome = "Café";
        prod2.codigo = "0-124";
        prod2.preco = 14.00;
        prod2.quantidadeEstoque = 100;

        System.out.println("Produto 1:");
        System.out.println(prod1);
        System.out.println("Produto 2:");
        System.out.println(prod2);
    }
}