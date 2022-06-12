package aula04_livraria;

import java.util.List;

public class Jogo extends Produto{
    List<String> generos;
    String distribuidora;
    String estudio;

    public Jogo() {
    }

    public Jogo(String nome, double preco, List<String> generos, String distribuidora, String estudio, int quantidade) {
        super(nome, preco,quantidade);
        this.generos = generos;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo{ID=" + id+
                ", generos=" + generos +
                ", distribuidora='" + distribuidora + '\'' +
                ", estudio='" + estudio + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
