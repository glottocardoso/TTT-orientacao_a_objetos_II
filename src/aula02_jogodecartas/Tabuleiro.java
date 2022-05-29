package aula02_jogodecartas;

import java.util.ArrayList;

public interface Tabuleiro {
    void inserirDeck(Deck deck);
    boolean  verificarCartaAtaque(CartaAtaque cartaAtaque);
    void verificarVencedor();
}
