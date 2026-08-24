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
    void aumentarSalario(Double percentual) {
        salario = salario + (salario * percentual / 100);
    }
    public boolean ganhaMais(Funcionario outro) {
    return this.salario > outro.salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", matricula=" + matricula + ", salario=" + salario
                + ", toString()=" + super.toString() + "]";
    }

    
    }

    
    
