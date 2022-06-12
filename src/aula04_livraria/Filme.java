package aula04_livraria;

import java.util.List;

public class Filme extends Produto {
    List<String> generos;
    List<String> diretores;
    List<String> produtores;
    String estudio;

    public Filme() {

    }

    public Filme(String nome, double preco, int quantidade, List<String> generos, List<String> diretores, List<String> produtores, String estudio) {
        super(nome, preco, quantidade);
        this.generos = generos;
        this.diretores = diretores;
        this.produtores = produtores;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "ID=" + id +
                ", nome='" + nome + '\'' +
                ", generos=" + generos +
                ", diretores=" + diretores +
                ", produtores=" + produtores +
                ", estudio='" + estudio + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
