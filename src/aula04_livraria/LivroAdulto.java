package aula04_livraria;

import java.util.ArrayList;

public class LivroAdulto extends Livro implements IAdulto{
    public LivroAdulto() {
    }

    public LivroAdulto(String nome, double preco, ArrayList<String> generos, String escritor, String editora, int quantidade) {
        super(nome, preco, generos, escritor, editora, quantidade);
    }
}
