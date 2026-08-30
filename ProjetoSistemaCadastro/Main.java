public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriel", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        Pedido pedido1 = new Pedido("Notebook", 2500.00, 1, cliente1);
        Pedido pedido2 = new Pedido("Mouse", 80.00, 2, cliente1);
        Pedido pedido3 = new Pedido("Teclado", 150.00, 1, cliente2);

        System.out.println("=== CLIENTES ===");
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("\n=== PEDIDOS ===");

        System.out.println(pedido1);
        System.out.println("Valor total: R$ " + pedido1.calcularTotal());

        System.out.println();

        System.out.println(pedido2);
        System.out.println("Valor total: R$ " + pedido2.calcularTotal());

        System.out.println();

        System.out.println(pedido3);
        System.out.println("Valor total: R$ " + pedido3.calcularTotal());
    }
}