package aula05_exemplo_notafiscal_2;

import aula05_exemplo_notafiscal.NotaFiscal;

import java.util.List;

public class GerenciadorAcoes {

    public GerenciadorAcoes() {

    }

    public static void executarAcoes(NotaFiscal notaFiscal, List<AcaoNota> acoes){
        for (AcaoNota acao: acoes) {
            acao.executar(notaFiscal);
        }
    }

}
