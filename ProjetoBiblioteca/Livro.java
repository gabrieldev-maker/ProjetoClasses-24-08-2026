package ProjetoBiblioteca;

public class Livro {
    String titulo;
    String autor;
    Integer anoPublicacao;
    boolean disponivel;

    // Construtor padrão
    public Livro() {
    }

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }
}
