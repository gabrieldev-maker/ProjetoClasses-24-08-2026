package ProjetoAluno;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    double mediaFinal;

    // construtor padrao
    public Aluno() {
    }
    // construtor carregado
    public Aluno(String nome, String matricula, String curso, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.mediaFinal = mediaFinal;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", mediaFinal=" + mediaFinal
                + ", toString()=" + super.toString() + "]";
    }
    

}
