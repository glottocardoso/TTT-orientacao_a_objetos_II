package aula05_exemplo_notafiscal;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(20);

        EnviadorEmail enviadorEmail = new EnviadorEmail();
        SalvarNota salvarNota = new SalvarNota();

        GeradorNotaFiscal geradorNotaFiscal = new GeradorNotaFiscal(enviadorEmail,salvarNota);

        geradorNotaFiscal.gera(fatura);
    }
}
