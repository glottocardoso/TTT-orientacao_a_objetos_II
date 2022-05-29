package aula02_jogodecartas;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CartaAtaqueEspecial extends CartaAtaque implements AtaqueEspecial{
    ArrayList<String> efeitos;

    public CartaAtaqueEspecial(String nome, String tipo, BigDecimal custo, ArrayList<String> efeitos) {
        super(nome, tipo, custo);
        this.efeitos = efeitos;
    }

    @Override
    public void exibirEfeitos() {
        for (String efeito : this.efeitos) {
            System.out.println(efeito);
        }
    }
}
