package aula04_livraria;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String categoria;
    protected static int contador = 0;
    protected int id;
    protected int quantidade;

    public void gerarid() {
        contador++;
        this.id = contador;
    }

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        gerarid();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
