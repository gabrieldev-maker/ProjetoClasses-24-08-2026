public class Funcionario {

    String nome;
    String cargo;
    String matricula;
    Double salario;

    // Construtor padrão
    public Funcionario() {
    }

    // Construtor carregado
    public Funcionario(String nome, String cargo, String matricula, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                '}';
    }
}