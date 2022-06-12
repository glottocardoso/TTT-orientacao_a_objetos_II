package aula04_livraria;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void interagirEstoque(IAcaoProduto acaoProduto, Produto produto){
        setProdutos(acaoProduto.executar(getProdutos(), produto));
    }

    public void visualizarEstoque(IVisualizarProduto visualizarProduto){
        visualizarProduto.executar(getProdutos());
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    private void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
