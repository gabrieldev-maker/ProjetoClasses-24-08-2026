package ProjetoBiblioteca;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.emprestarLivro("O Senhor dos Anéis");

    }
}
