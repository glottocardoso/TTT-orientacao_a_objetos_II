package aula04_livraria;

public class SubtrairCaixa implements IAcaoCaixa{
    @Override
    public double executar(double dinheiroInteracao) {
        return dinheiroInteracao*-1;
    }
}
