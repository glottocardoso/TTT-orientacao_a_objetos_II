package aula02_jogodecartas;

import java.util.ArrayList;

public interface Tabuleiro {
    void inserirPlayer(Player player);
    boolean  verificarCartaAtaque(CartaAtaque cartaAtaque);
    void verificarVencedor();
}
