package aula04_livraria;

import java.util.ArrayList;

public class Comprar{

    public static void comprar(Caixa caixa, Estoque estoque, Produto produto, int quantidadeComprada){

        //Validações aplicadas:
        ArrayList<IValidarCompra> listaValidacoes = new ArrayList<>();

        listaValidacoes.add(new VerificarProdutoAdulto());

        if (validarCompra(listaValidacoes,produto)){
            efetuarCompra(caixa,estoque,produto,quantidadeComprada);
        }else{
            System.out.println("Compra não efetuada!");
        }
    }

    public static void efetuarCompra(Caixa caixa, Estoque estoque, Produto produto, int quantidadeComprada){

        //Descontos aplicados:
        ArrayList<ICalcularDesconto> listaDescontos = new ArrayList<>();

        listaDescontos.add(new DescontoLivro());

        double valorTotalDesconto = calcularDescontos(listaDescontos,produto,quantidadeComprada);
        double valorCompra = produto.getPreco()*quantidadeComprada-valorTotalDesconto;

        //Execução da compra:
        produto.setQuantidade(produto.getQuantidade()-quantidadeComprada);
        estoque.interagirEstoque(new AlterarProduto(),produto);
        caixa.interagirCaixa(new AdicionarCaixa(), valorCompra);
        System.out.println("Compra efetuada com sucesso!");
        System.out.println("Dinheiro restante no caixa: " + caixa.getDinheiroPresente());
    }

    public static boolean validarCompra(ArrayList<IValidarCompra> listaDeValidacoes, Produto produto){
        for (IValidarCompra validacao: listaDeValidacoes) {
            if (!validacao.executar(produto)){
                return false;
            }
        }
        return true;
    }

    public static double calcularDescontos(ArrayList<ICalcularDesconto> listaDescontos, Produto produto, int quantidadeComprada){
        double valorTotalDesconto = 0;
        for (ICalcularDesconto desconto: listaDescontos) {
            valorTotalDesconto+=desconto.calcularDesconto(produto,quantidadeComprada);
        }
        return valorTotalDesconto;
    }
}
