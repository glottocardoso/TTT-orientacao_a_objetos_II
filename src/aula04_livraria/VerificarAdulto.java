package aula04_livraria;

public class VerificarAdulto {
    public static <T extends Produto> boolean verificarAdulto(T produto){
        return produto instanceof IAdulto;
    }
}
