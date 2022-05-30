package aula02_jogodecartas;

import java.util.ArrayList;

public class TabuleiroParty implements Tabuleiro {

    ArrayList<Player> players = new ArrayList<>();

    public TabuleiroParty(Player player1, Player player2,Player player3,Player player4,Player player5) {
        inserirPlayer(player1);
        inserirPlayer(player2);
        inserirPlayer(player3);
        inserirPlayer(player4);
        inserirPlayer(player5);
    }

    @Override
    public void inserirPlayer(Player player) {
        if(player.tamanhoPlayer()==80) {
            if (this.players.size() < 5) {
                this.players.add(player);
            } else {
                System.out.println("Tabuleiro cheio");
            }
        }else {
            System.out.println("O player deve ter 80 cartas");
        }
    }

    @Override
    public boolean verificarCartaAtaque(CartaAtaque cartaAtaque) {
        {
            return cartaAtaque.getVida() > 0;
        }
    }

    @Override
    public void verificarVencedor() {
        ArrayList<Player> playersMortos = new ArrayList<>();
        ArrayList<Player> playersComVida= new ArrayList<>();

        int a = 0;
        for (int i = 0; i < players.size() ; i++) {
            if (players.get(i).getVidaPlayer()<=0){
                playersMortos.add(players.get(i));
            }else {
                playersComVida.add(players.get(i));
            }
            a++;
        }
        if (playersComVida.size()==1){
            System.out.println("O vencedor é o Player " +a);
        }else{
            System.out.println("Ainda não temos um vencedor");
        }
    }
}

