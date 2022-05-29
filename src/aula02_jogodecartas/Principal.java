package aula02_jogodecartas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<CartaAtaque> cartas1 = new ArrayList<>();
        ArrayList<CartaAtaque> cartas2 = new ArrayList<>();

        //Criando Cartas Comuns do Deck 1:
        BigDecimal custoPadrao = new BigDecimal("12.0");

        for (int i = 0; i < 40; i++) {
            CartaAtaque carta = new CartaAtaque((String) "A"+i,"Ataque", custoPadrao);
            cartas1.add(carta);
        }

        //Criando Cartas Especiais do Deck 1:
        BigDecimal custoEspecial = new BigDecimal("20.0");

        for (int i = 0; i < 10; i++) {
            ArrayList<String> efeitos = new ArrayList<>();
            efeitos.add("Luz");
            efeitos.add("Super chuva");
            CartaAtaque carta = new CartaAtaqueEspecial((String) "A Especial"+i,"Ataque Especial", custoEspecial,efeitos);
            cartas1.add(carta);
        }

        //Criando Cartas Comuns do Deck 2:
        for (int i = 0; i < 40; i++) {
            CartaAtaque carta = new CartaAtaque((String) "B"+i,"Ataque", custoPadrao);
            cartas2.add(carta);
        }

        //Criando Cartas Especiais do Deck 2:
        for (int i = 0; i < 10; i++) {
            ArrayList<String> efeitos = new ArrayList<>();
            efeitos.add("Luz");
            efeitos.add("Super chuva");
            CartaAtaque carta = new CartaAtaqueEspecial((String) "B"+i,"Ataque Especial", custoEspecial,efeitos);
            cartas2.add(carta);
        }

        Deck deck1 = new Deck(cartas1);
        Deck deck2 = new Deck(cartas2);

        deck1.listarDeck();
        deck2.listarDeck();

        //Populando Tabuleiro Versus:
        TabuleiroVersus tabuleiroVersus = new TabuleiroVersus(deck1, deck2);

        tabuleiroVersus.popularCampo1(10, 13, 20, 25, 30, 40, 43);
        tabuleiroVersus.popularCampo2(9, 10, 19, 24, 29, 45, 49);

        tabuleiroVersus.listarCampos();

        //Promovendo Batalha:
        tabuleiroVersus.batalhar();
    }
}
