package aula02_jogodecartas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<CartaAtaque> cartas1 = new ArrayList<>();
        ArrayList<CartaAtaque> cartas2 = new ArrayList<>();

        //Criando Cartas Comuns do Player 1:
        BigDecimal custoPadrao = new BigDecimal("12.0");

        for (int i = 0; i < 40; i++) {
            CartaAtaque carta = new CartaAtaque((String) "A"+i,"Ataque", custoPadrao);
            cartas1.add(carta);
        }

        //Criando Cartas Especiais do Player 1:
        BigDecimal custoEspecial = new BigDecimal("20.0");

        for (int i = 0; i < 10; i++) {
            ArrayList<String> efeitos = new ArrayList<>();
            efeitos.add("Luz");
            efeitos.add("Super chuva");
            CartaAtaque carta = new CartaAtaqueEspecial((String) "A Especial"+i,"Ataque Especial", custoEspecial,efeitos);
            cartas1.add(carta);
        }

        //Criando Cartas Comuns do Player 2:
        for (int i = 0; i < 40; i++) {
            CartaAtaque carta = new CartaAtaque((String) "B"+i,"Ataque", custoPadrao);
            cartas2.add(carta);
        }

        //Criando Cartas Especiais do Player 2:
        for (int i = 0; i < 10; i++) {
            ArrayList<String> efeitos = new ArrayList<>();
            efeitos.add("Luz");
            efeitos.add("Super chuva");
            CartaAtaque carta = new CartaAtaqueEspecial((String) "B"+i,"Ataque Especial", custoEspecial,efeitos);
            cartas2.add(carta);
        }

        Player player1 = new Player(cartas1);
        Player player2 = new Player(cartas2);

        player1.listarPlayer();
        player2.listarPlayer();

        //Populando Tabuleiro Versus:
        TabuleiroVersus tabuleiroVersus = new TabuleiroVersus(player1, player2);

        tabuleiroVersus.popularCampo1(10, 13, 20, 25, 30, 40, 43);
        tabuleiroVersus.popularCampo2(9, 10, 19, 24, 29, 45, 49);

        tabuleiroVersus.listarCampos();

        //Promovendo Batalha:
        tabuleiroVersus.batalhar();
    }
}
