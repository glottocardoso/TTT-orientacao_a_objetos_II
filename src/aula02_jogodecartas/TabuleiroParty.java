package aula02_jogodecartas;

import java.util.ArrayList;

public class TabuleiroParty implements Tabuleiro {

    ArrayList<Deck> decks = new ArrayList<>();

    public TabuleiroParty(Deck deck1, Deck deck2,Deck deck3,Deck deck4,Deck deck5) {
        inserirDeck(deck1);
        inserirDeck(deck2);
        inserirDeck(deck3);
        inserirDeck(deck4);
        inserirDeck(deck5);
    }

    @Override
    public void inserirDeck(Deck deck) {
        if(deck.tamanhoDeck()==80) {
            if (this.decks.size() < 5) {
                this.decks.add(deck);
            } else {
                System.out.println("Tabuleiro cheio");
            }
        }else {
            System.out.println("O deck deve ter 80 cartas");
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
        ArrayList<Deck> decksMortos = new ArrayList<>();
        ArrayList<Deck> decksComVida= new ArrayList<>();

        int a = 0;
        for (int i = 0; i < decks.size() ; i++) {
            if (decks.get(i).getVidaDeck()<=0){
                decksMortos.add(decks.get(i));
            }else {
                decksComVida.add(decks.get(i));
            }
            a++;
        }
        if (decksComVida.size()==1){
            System.out.println("O vencedor é o Player " +a);
        }else{
            System.out.println("Ainda não temos um vencedor");
        }
    }
}
