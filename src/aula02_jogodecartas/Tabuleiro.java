package aula02_jogodecartas;

import java.util.ArrayList;

public interface Tabuleiro {
    void inserirDeck(Player player);
    boolean  verificarCartaAtaque(CartaAtaque cartaAtaque);
    void verificarVencedor();
}
