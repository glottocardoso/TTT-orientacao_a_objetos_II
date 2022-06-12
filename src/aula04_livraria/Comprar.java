package aula04_livraria;

public class Comprar{

    public static void comprar(Caixa caixa, Estoque estoque, Produto produto, int quantidade){

        if (VerificarProdutoAdulto.verificarAdulto(produto)){
            Comprador comprador = ConstrutorComprador.executar();
            if (VerificarComprador.executar(comprador)){
                produto.setQuantidade(produto.getQuantidade()-quantidade);
                estoque.interagirEstoque(new AlterarProduto(),produto);
                caixa.interagirCaixa(new SubtrairCaixa(), CalcularDesconto.calcularDesconto(produto,quantidade));
                System.out.println("Compra efetuada com sucesso!");
                System.out.println("Dinheiro restante no caixa: " + caixa.getDinheiroPresente());
            }else {
                System.out.println("Esse produto não pode ser adquirido, pois você não possui mais de 18 anos!");
            };
        }else {
            produto.setQuantidade(produto.getQuantidade()-quantidade);
            estoque.interagirEstoque(new AlterarProduto(),produto);
            caixa.interagirCaixa(new SubtrairCaixa(), CalcularDesconto.calcularDesconto(produto,quantidade));
            System.out.println("Compra efetuada com sucesso!");
            System.out.println("Dinheiro restante no caixa: " + caixa.getDinheiroPresente());
        }


    }
}
