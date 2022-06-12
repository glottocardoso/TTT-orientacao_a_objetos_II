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
        this.categoria = "Livro";
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

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
