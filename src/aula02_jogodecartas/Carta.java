package aula02_jogodecartas;

import java.math.BigDecimal;

public abstract class Carta {
    String nome;
    String tipo;
    BigDecimal custo;
    int vida = 100;

    public Carta(String nome, String tipo, BigDecimal custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
