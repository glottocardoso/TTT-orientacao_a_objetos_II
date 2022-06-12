package aula04_livraria;

public class Caixa {
    private double dinheiroPresente;

    public Caixa(double dinheiroPresente) {
        this.dinheiroPresente = dinheiroPresente;
    }

    public void interagirCaixa(IAcaoCaixa acaoCaixa, double dinheiroInteracao){
        setDinheiroPresente(getDinheiroPresente() + acaoCaixa.executar(dinheiroInteracao));
    }

    public double getDinheiroPresente() {
        return dinheiroPresente;
    }

    private void setDinheiroPresente(double dinheiroPresente) {
        this.dinheiroPresente = dinheiroPresente;
    }
}