package aula04_livraria;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void interagirEstoque(AcaoProduto acaoProduto, Produto produto){
        setProdutos(acaoProduto.executar(getProdutos(), produto));
    }

    public void visualizarEstoque(VisualizarProduto visualizarProduto){
        visualizarProduto.executar(getProdutos());
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    private void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
