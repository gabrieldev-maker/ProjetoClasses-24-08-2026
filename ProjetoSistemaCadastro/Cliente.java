public class Cliente {

    String nome;
    String cpf;

    // Construtor padrão
    public Cliente() {

    }

    // Construtor carregado
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método com lógica
    public void apresentarCliente() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
    }
}