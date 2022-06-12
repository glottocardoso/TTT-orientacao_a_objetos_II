package aula04_livraria;

public class VerificarProdutoAdulto {
    public static <T extends Produto> boolean verificarAdulto(T produto){
        return produto instanceof IAdulto;
    }
}
