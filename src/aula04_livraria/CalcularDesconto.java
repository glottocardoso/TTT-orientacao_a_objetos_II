package aula04_livraria;

public class CalcularDesconto {

    public static <T extends Produto> double calcularDesconto(T produto, int quantidade){

        double valorCompra = produto.getPreco()*quantidade;
        double precoDesoconto = valorCompra;

        if (produto instanceof Livro && valorCompra > 200) {
            precoDesoconto = valorCompra*0.85;
        }
        return precoDesoconto;
    }
}
