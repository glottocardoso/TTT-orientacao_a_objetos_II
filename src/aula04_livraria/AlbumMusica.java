package aula04_livraria;

import java.util.ArrayList;
import java.util.List;

public class AlbumMusica extends Produto {
    ArrayList<String> musicosBandas;
    ArrayList<String> generos;
    ArrayList<String> selos;

    public AlbumMusica() {

    }

    public AlbumMusica(String nome, double preco, int quantidade, ArrayList<String> musicosBandas, ArrayList<String> generos, ArrayList<String> selos) {
        super(nome, preco, quantidade);
        this.musicosBandas = musicosBandas;
        this.generos = generos;
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "AlbumMusica{" +
                "ID=" + id +
                ", nome='" + nome + '\'' +
                ", musicosBandas=" + musicosBandas +
                ", generos=" + generos +
                ", selos=" + selos +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
