package aula05_exemplo_notafiscal_2;

import aula05_exemplo_notafiscal.Fatura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AcaoNota> acoes = new ArrayList<>();

        acoes.add(new EnviadorEmail());
        acoes.add(new SalvarNota());

        GeradorNotaFiscal geradorNotaFiscal = new GeradorNotaFiscal(acoes);
        geradorNotaFiscal.gera(new Fatura(20));
    }
}
