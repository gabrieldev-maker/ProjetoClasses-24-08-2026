package ProjetoBiblioteca;

public class Biblioteca {

    Livro[] livros = new Livro[3];

    public Biblioteca() {
        livros[0] = new Livro("Livro 1", "Autor 1", 2020);
        livros[1] = new Livro("Livro 2", "Autor 2", 2019);
        livros[2] = new Livro("Livro 3", "Autor 3", 2021);
    }
    void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }
    void emprestarLivro(String titulo) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].titulo.equals(titulo) && livros[i].disponivel) {
                livros[i].disponivel = false;
                System.out.println("Livro emprestado: " + titulo);
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo: " + titulo);
    }
    
}
