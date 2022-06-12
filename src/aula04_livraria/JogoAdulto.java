package aula04_livraria;

import java.util.List;

public class JogoAdulto extends Jogo implements IAdulto{
    public JogoAdulto() {
    }

    public JogoAdulto(String nome, double preco, List<String> generos, String distribuidora, String estudio, int quantidade) {
        super(nome, preco, generos, distribuidora, estudio, quantidade);
    }
}
