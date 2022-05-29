package aula02_jogodecartas;

import java.util.ArrayList;

public class Deck {
    ArrayList<CartaAtaque> cartas;
    public Deck(ArrayList<CartaAtaque> cartas) {
        this.cartas = cartas;
    }

    protected int tamanhoDeck(){
        return this.cartas.size();
    }

    protected int getVidaDeck(){
        int vida = 0;
        for (CartaAtaque carta: cartas) {
            vida += carta.getVida();
        }
        return vida;
    }

    protected void listarDeck(){
        System.out.println("COMPOSIÇÃO DO DECK: =====================================");
        for (int i=0; i<cartas.size(); i++) {
            System.out.println(i+"- Nome: "+cartas.get(i).getNome()+"- Tipo: "+ cartas.get(i).getTipo()+" - Poder: "+cartas.get(i).getPoder()+"- Resistencia: "+cartas.get(i).getResistencia()+"- Vida:"+cartas.get(i).getVida());
        }
    }
}
