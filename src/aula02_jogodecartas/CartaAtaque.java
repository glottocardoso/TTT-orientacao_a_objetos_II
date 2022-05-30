package aula02_jogodecartas;

import java.math.BigDecimal;
import java.util.Random;

public class CartaAtaque extends Carta implements Ataque{
    protected int poder;
    protected int resistencia;
    protected Random gerador = new Random();

    public CartaAtaque(String nome, String tipo, BigDecimal custo) {
        super(nome, tipo, custo);
        this.poder = gerador.nextInt(91)+10;
        this.resistencia = gerador.nextInt(11);
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }
}
