public class Produto {
    String nome;
    String codigo;
    Double preco;
    Integer quantidadeEstoque;

    // construtor padrao 
    public Produto() {

    }
    
    //construtor carregado
    public Produto(String nome, String codigo, double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidadeEstoque="
                + quantidadeEstoque + ", toString()=" + super.toString() + "]";
    }

    
    }
        
