public class Main {

    public static void main(String[] args) {

        // Funcionário 1
        Funcionario func1 = new Funcionario(
                "João",
                "Analista",
                "12345",
                5000.0
        );

        // Funcionário 2
        Funcionario func2 = new Funcionario(
                "Maria",
                "Gerente",
                "67890",
                7000.0
        );

        System.out.println(func1);
        System.out.println(func2);
    }
}