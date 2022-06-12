package aula04_livraria;

public class DescontoLivro implements ICalcularDesconto {

    @Override
    public <T extends Produto> double calcularDesconto(T produto, int quantidade){

        double valorCompra = produto.getPreco()*quantidade;
        double desoconto = 0;

        if (produto instanceof Livro && valorCompra > 200) {
            desoconto = valorCompra*0.15;
            System.out.println("Você ganhou um desconto pela compra de Livros acima de R$ 200,00");
        }
        return desoconto;
    }
}
