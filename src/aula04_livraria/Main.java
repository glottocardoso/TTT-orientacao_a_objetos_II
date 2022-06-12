package aula04_livraria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //PRODUTOS:
        //Criando gêneros:
        ArrayList<String> generos1 = new ArrayList<>();
        generos1.add("Auto-ajuda");

        ArrayList<String> generos2 = new ArrayList<>();
        generos2.add("Ficção");
        generos2.add("Suspense");

        ArrayList<String> generos3 = new ArrayList<>();
        generos3.add("Ação");

        ArrayList<String> generos4 = new ArrayList<>();
        generos4.add("Ficção erótica");

        ArrayList<String> generos5 = new ArrayList<>();
        generos5.add("Rock Alternativo");

        //Criando diretores:
        ArrayList<String> diretores1 = new ArrayList<>();
        diretores1.add("Rob Minkoff");
        diretores1.add("Roger Allers");

        //Criando produtores:
        ArrayList<String> produtores1 = new ArrayList<>();
        produtores1.add("Jon Favreau");
        produtores1.add("Karen Gilchrist");

        //Criando músicos:
        ArrayList<String> musicosBandas1 = new ArrayList<>();
        musicosBandas1.add("Charlie Brown Jr.");

        //Criando selos:
        ArrayList<String> selos1 = new ArrayList<>();
        selos1.add(" Troféu Radio Rock 2003");

        //Criando produtos:
        Produto livro1 = new Livro("Tríade do Tempo", 35, generos1, "Christian Barbosa", "Ediouro",200);
        Produto livro2 = new Livro("Harry Potter", 35, generos2, "J. K. Rowling", "Rocco",1000);
        Produto jogo1 = new Jogo("Donkey Kong Country", 35, generos3,"Nintendo","Rare",10);
        Produto jogo2 = new Jogo("Super Mario Bros 3", 40, generos3,"Nintendo","Nintendo",50);
        Produto filme1 = new Filme("Rei Leão", 50, 50, generos3, diretores1 , produtores1, "Walt Disney Pictures");
        Produto album1 = new AlbumMusica("Acústico MTV: Charlie Brown Jr.", 25, 100, musicosBandas1, generos5, selos1);
        Produto brinquedo1 = new Brinquedo("Super Nintendo", 1000, 5, "Vídeo-Game");

        //ESTOQUE:
        //Adicionando produtos no estoque:
        ArrayList<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque();

        estoque.interagirEstoque(new AdicionarProduto(),livro1);
        estoque.interagirEstoque(new AdicionarProduto(),livro2);
        estoque.interagirEstoque(new AdicionarProduto(),jogo1);
        estoque.interagirEstoque(new AdicionarProduto(),jogo2);
        estoque.interagirEstoque(new AdicionarProduto(),filme1);
        estoque.interagirEstoque(new AdicionarProduto(),album1);
        estoque.interagirEstoque(new AdicionarProduto(),brinquedo1);

        System.out.println("ESTOQUE INICIAL=============================");
        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Removendo produtos do estoque:
        estoque.interagirEstoque(new RemoverProduto(),livro1);

        System.out.println("ESTOQUE APÓS REMOÇÃO DE PRODUTO=============================");
        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Modificando produtos do estoque:
        livro2.setQuantidade(1100);
        estoque.interagirEstoque(new AlterarProduto(),livro2);

        System.out.println("ESTOQUE APÓS MODIFICAÇÃO DE PRODUTO=============================");
        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Vizualizando produtos:
        System.out.println("VIZUALIZANDO PRODUTOS DE DIVERSAS FORMAS=============================");
        estoque.visualizarEstoque(new VerProdutosEstoque());
        estoque.visualizarEstoque(new VerProdutosEstoqueCategoria());
        estoque.visualizarEstoque(new VerProdutoID());

        new QtdProdutosTipo<>().executar(estoque, new Livro());
        new QtdProdutosTipo<>().executar(estoque, new Jogo());

        //CAIXA:
        Caixa caixa = new Caixa(100000);

        //EXECUÇÃO:
        //Comprando produtos:
        System.out.println("COMPRANDO PRODUTOS===================================");
        System.out.println("Livro ID=2:");
        Comprar.comprar(caixa,estoque,livro2,2);

        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Produto adulto:
        System.out.println("COMPRANDO PRODUTOS ADULTOS===================================");
        Produto livroAdulto = new LivroAdulto("50 Tons de Cinza", 35, generos4, "E. L. James", "Intrínseca",50);
        estoque.interagirEstoque(new AdicionarProduto(),livroAdulto);
        estoque.visualizarEstoque(new VerProdutosEstoque());

        Comprar.comprar(caixa,estoque,livroAdulto,2);

        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Comprando livro com desconto:
        System.out.println("COMPRANDO LIVRO COM DESCONTO===================================");
        Comprar.comprar(caixa,estoque,livro2,100);
    }
}
