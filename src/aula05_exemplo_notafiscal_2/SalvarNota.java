package aula05_exemplo_notafiscal_2;

import aula05_exemplo_notafiscal.NotaFiscal;

public class SalvarNota implements AcaoNota{

    @Override
    public void executar(NotaFiscal notaFiscal) {
        System.out.println("Salvando nota fiscal em banco de dados...");
    }
}
