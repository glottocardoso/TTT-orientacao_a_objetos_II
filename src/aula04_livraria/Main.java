package aula04_livraria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando produtos:
        ArrayList<String> generos = new ArrayList<>();
        generos.add("Auto-ajuda");
        generos.add("Ficção");
        generos.add("Ação");

        Produto livro = new Livro("Tríade do Tempo", 35, generos, "Christian Barbosa", "Ediouro",10);
        Produto livro2 = new Livro("Tríade do Tempo", 35, generos, "Christian Barbosa", "Ediouro",20);
        Produto jogo = new Jogo("Donkey Kong Country", 35, generos,"Nintendo","Rare",10);

        //Adicionando produtos no estoque:
        ArrayList<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque(produtos);

        estoque.interagirEstoque(new AdicionarProduto(),livro);
        estoque.interagirEstoque(new AdicionarProduto(),livro2);
        estoque.interagirEstoque(new AdicionarProduto(),jogo);

        //Removendo produtos do estoque:
        estoque.interagirEstoque(new RemoverProduto(),livro2);

        //Modificando produtos do estoque:
        livro.setQuantidade(103);
        estoque.interagirEstoque(new AlterarProduto(),livro);

        //Vizualizando produtos:
        estoque.visualizarEstoque(new VerProdutosEstoque());
        estoque.visualizarEstoque(new VerProdutosEstoqueCatgoria());
        estoque.visualizarEstoque(new VerProdutoID());

        new QtdProdutosTipo<>().executar(estoque, new Livro());
        new QtdProdutosTipo<>().executar(estoque, new Jogo());

        //CAIXA:
        Caixa caixa = new Caixa(100000);

        //Comprando produtos:
        Comprar.comprar(caixa,estoque,livro,2);

        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Produto adulto:
        Produto livroAdulto = new LivroAdulto("Tríade do Tempo", 35, generos, "Christian Barbosa", "Ediouro",10);
        estoque.interagirEstoque(new AdicionarProduto(),livroAdulto);
        estoque.visualizarEstoque(new VerProdutosEstoque());

        Comprar.comprar(caixa,estoque,livroAdulto,2);
    }
}
