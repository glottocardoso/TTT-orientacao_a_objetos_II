package aula05_exemplo_notafiscal_2;

import aula05_exemplo_notafiscal.Fatura;
import aula05_exemplo_notafiscal.NotaFiscal;

import java.util.List;

public class GeradorNotaFiscal {

    private List<AcaoNota> acoes;

    public GeradorNotaFiscal(List<AcaoNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura){
        double valor = fatura.getValorFatura();
        NotaFiscal notaFiscal = new NotaFiscal(valor);

        GerenciadorAcoes.executarAcoes(notaFiscal, acoes);

        return notaFiscal;
    }
}
