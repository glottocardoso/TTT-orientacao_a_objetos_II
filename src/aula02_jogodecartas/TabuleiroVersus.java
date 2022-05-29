package aula02_jogodecartas;

import java.util.ArrayList;
import java.util.Scanner;

public class TabuleiroVersus implements Tabuleiro {

    ArrayList<Deck> decks = new ArrayList<>();
    ArrayList<CartaAtaque> campo1 = new ArrayList<>();
    ArrayList<CartaAtaque> campo2 = new ArrayList<>();


    public TabuleiroVersus(Deck deck1, Deck deck2) {
        inserirDeck(deck1);
        inserirDeck(deck2);
    }

    public void popularCampo1(int carta1, int carta2, int carta3, int carta4, int carta5, int cartaEspecial1, int cartaEspecial2){
        campo1.add(decks.get(0).cartas.get(carta1));
        campo1.add(decks.get(0).cartas.get(carta2));
        campo1.add(decks.get(0).cartas.get(carta3));
        campo1.add(decks.get(0).cartas.get(carta4));
        campo1.add(decks.get(0).cartas.get(carta5));
        campo1.add(decks.get(0).cartas.get(cartaEspecial1));
        campo1.add(decks.get(0).cartas.get(cartaEspecial2));
    }

    public void popularCampo2(int carta1, int carta2, int carta3, int carta4, int carta5, int cartaEspecial1, int cartaEspecial2){
        campo2.add(decks.get(1).cartas.get(carta1));
        campo2.add(decks.get(1).cartas.get(carta2));
        campo2.add(decks.get(1).cartas.get(carta3));
        campo2.add(decks.get(1).cartas.get(carta4));
        campo2.add(decks.get(1).cartas.get(carta5));
        campo2.add(decks.get(1).cartas.get(cartaEspecial1));
        campo2.add(decks.get(1).cartas.get(cartaEspecial2));
    }

    public void batalhar(){
        int cartaPlayer1;
        int cartaPlayer2;
        int vida1;
        int poder1;
        int resistencia1;
        int vida2;
        int poder2;
        int resistencia2;

        System.out.println("Escolha a carta de ataque do Player 1:");
        Scanner sc = new Scanner(System.in);
        cartaPlayer1 = sc.nextInt();

        System.out.println("Escolha a carta de ataque do Player 2:");
        cartaPlayer2 = sc.nextInt();

        CartaAtaque cartaAtaque1 = campo1.get(cartaPlayer1);
        CartaAtaque cartaAtaque2 = campo2.get(cartaPlayer2);

        if (verificarCartaAtaque(cartaAtaque1)){
            vida1 = cartaAtaque1.getVida();
            poder1 = cartaAtaque1.getPoder();
            resistencia1 = cartaAtaque1.getResistencia();
        }else {
            System.out.println("Player 1, esta carta está morta!");
            return;
        }

        if (verificarCartaAtaque(cartaAtaque2)){
            vida2 = cartaAtaque2.getVida();
            poder2 = cartaAtaque2.getPoder();
            resistencia2 = cartaAtaque2.getResistencia();
        }else {
            System.out.println("Player 2, esta carta está morta!");
            return;
        }

        cartaAtaque1.setVida(vida1-poder2+resistencia1);
        cartaAtaque2.setVida(vida2-poder1-resistencia2);

        verificarVencedor();

        System.out.println("Vida do Player 1: " + decks.get(0).getVidaDeck());
        System.out.println("Vida do Player 2: " + decks.get(1).getVidaDeck());
    }

    public void listarCampos(){
        System.out.println("COMPOSIÇÃO DOS CAMPOS: ================================================");
        System.out.println("Player 1:");
        for (int i = 0; i < campo1.size(); i++) {
            System.out.println(i+"- Nome: "+campo1.get(i).getNome()+"- Tipo: "+ campo1.get(i).getTipo()+" - Poder: "+campo1.get(i).getPoder()+"- Resistencia: "+campo1.get(i).getResistencia()+"- Vida:"+campo1.get(i).getVida());
        }
        System.out.println("Player 2:");
        for (int i = 0; i < campo2.size(); i++) {
            System.out.println(i+"- Nome: "+campo2.get(i).getNome()+"- Tipo: "+ campo2.get(i).getTipo()+" - Poder: "+campo2.get(i).getPoder()+"- Resistencia: "+campo2.get(i).getResistencia()+"- Vida:"+campo2.get(i).getVida());
        }
    }

    @Override
    public void inserirDeck(Deck deck) {
        if(deck.tamanhoDeck()==50) {
            if (this.decks.size() < 2) {
                this.decks.add(deck);
            } else {
                System.out.println("Tabuleiro cheio");
            }
        }else {
            System.out.println("O deck deve ter 50 cartas");
        }
    }

    @Override
    public boolean verificarCartaAtaque(CartaAtaque cartaAtaque) {
        return cartaAtaque.getVida() > 0;
    }

    @Override
    public void verificarVencedor() {
        if (decks.get(0).getVidaDeck()<=0){
            System.out.println("Player 2 venceu!");
        }else if (decks.get(2).getVidaDeck()<=0) {
            System.out.println("Player 1 venceu!");
        }else {
            System.out.println("Ainda não temos um vencedor");
        }
    }
}
