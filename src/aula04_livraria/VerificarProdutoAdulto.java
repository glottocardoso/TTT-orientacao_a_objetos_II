package aula04_livraria;

public class VerificarProdutoAdulto implements IValidarCompra {
    /*
    public static <T extends Produto> boolean executar(T produto){
        return produto instanceof IAdulto;
    }

     */


    @Override
    public boolean executar(Produto produto) {
        if (produto instanceof IAdulto){
            Comprador comprador = ConstrutorComprador.executar();
            return VerificarMaioridade.executar(comprador);
        }else {
            return true;
        }
    }
}
