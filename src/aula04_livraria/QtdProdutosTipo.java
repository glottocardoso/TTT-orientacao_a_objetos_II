package aula04_livraria;

public class QtdProdutosTipo<T> {

    public void executar(Estoque estoque, T tipo){
        int quantidade = 0;
        for (Produto produto: estoque.getProdutos()) {
            if (tipo.getClass() == produto.getClass()){
                quantidade += produto.getQuantidade();
            };
        }
        System.out.println("O total de produtos em estoque é: " + quantidade);
    }
}
