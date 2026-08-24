package ProjetoBiblioteca;

public class Biblioteca {

    Livro[] livros = new Livro[3];

    public Biblioteca() {
        livros[0] = new Livro("Livro 1", "Autor 1", 2020, true);
        livros[1] = new Livro("Livro 2", "Autor 2", 2019, false);
        livros[2] = new Livro("Livro 3", "Autor 3", 2021, true);
    }
}
