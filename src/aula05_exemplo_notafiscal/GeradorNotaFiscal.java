package aula05_exemplo_notafiscal;

public class GeradorNotaFiscal {

    private EnviadorEmail enviadorEmail;
    private SalvarNota salvarNota;

    public GeradorNotaFiscal(EnviadorEmail enviadorEmail, SalvarNota salvarNota) {
        this.enviadorEmail = enviadorEmail;
        this.salvarNota = salvarNota;
    }

    public NotaFiscal gera(Fatura fatura){
        double valor = fatura.getValorFatura();

        NotaFiscal notaFiscal = new NotaFiscal(valor);

        enviadorEmail.enviarEmail(notaFiscal);
        salvarNota.salvarNota(notaFiscal);

        return notaFiscal;
    }
}
