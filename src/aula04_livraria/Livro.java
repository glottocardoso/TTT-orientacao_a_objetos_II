package aula04_livraria;

import java.util.ArrayList;

public class Livro extends Produto{
    private ArrayList<String> generos;
    private String escritor;
    private String editora;

    public Livro() {

    }

    public Livro(String nome, double preco, ArrayList<String> generos, String escritor, String editora, int quantidade) {
        super(nome, preco, quantidade);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{ID=" + id +
                ", generos=" + generos +
                ", escritor='" + escritor + '\'' +
                ", editora='" + editora + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
