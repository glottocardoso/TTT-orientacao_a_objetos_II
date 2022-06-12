package aula05_exemplo_notafiscal_2;

import aula05_exemplo_notafiscal.NotaFiscal;

public class EnviadorEmail implements AcaoNota{
    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal por e-mail...");
    }
}
