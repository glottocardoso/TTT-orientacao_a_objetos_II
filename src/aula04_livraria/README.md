# Livraria
## Introdução
Este é um sistema de livraria capaz de cadastrar livros, jogos, filmes, álbuns de música e brinquedos.
É capaz de realizar uma operação de compra, aplicando o valor a um caixa e subtraindo os produtos comprados do estoque.

## Contextos
O sistema está dividido em 4 contextos:
- Produtos: Unidade básica do sistema, que armazena os atributos e métodos de cada produto a ser cadastrado.
- Estoque: Armazena produtos, bem como suas características, preço e quantidades;
- Caixa: Armazena o valor presente no caixa;
- Compra: Faz validações, aplica descontos e em seguida subtrai a quantidade de produtos comprados
do estoque e adiciona o valor da compra ao caixa.


## Produto
### Classe Produto:
Classe abstrata que contém os atributos id, nome, preco e quantidade. Essa classe é a superclasse de 
todos os produtos específicos a serem criados (livros, jogos, etc.). Possui um atributo estático
"contador" que, a cada nova instância, incrementa 1 através do método "gerarId" (inicializado com seu construtor)
, que, por sua vez, atribui o contador ao atributo id.

### Classes de Produtos Específicos:
Classes concretas que estendem a classe Produto (Livro, Jogo, Brinquedo, etc.).

### Classes de Produtos Adultos:
Classes concretas que estendem as classes de produtos específicos. A única diferença é que elas assinam
a interface IAdulto, necessária para classificar esse tipo de produto como um produto destinado à adultos.

## Estoque
### Classe Estoque:
A classe Estoque possui apenas um atributo "produtos" que é um ArrayList de T, sendo T algum produto
específico que estende a classe abstrada Produto. Sua função é apenas armazenar os produtos.
Qualquer modificação nos produtos, deve ser feita através do método **interagirEstoque** e qualquer
visualização de produtos deve ser feita através do método **visualizarEstoque**.
#### Médodos:
- **interagirEstoque(IAcaoProduto acaoProduto, Produto produto)**: Para provocar uma modificação em algum produto.
Recebe um objeto que implemente a interface IAcaoProduto e um Produto cadastrado no estoque. Assim, se 
novos tipos de modificação em produtos forem necessários, basta criá-los assinando IAcaoProduto.
(Princípio Open/Closes do SOLID). As classes que assinam essa interface devem possuir um método que receba
a lista de produtos do estoque e o produto a ser afetado, e retornam uma nova lista de produtos para ser
atribuída ao estoque por esse método.
  - **acaoProduto**: É um objeto criado a partir de alguma classe que assine o contrato IAcaoProduto.
  Temos três disponíveis:
    - *AdicionarProduto*: Para adicionar um produto no estoque.
    - *RemoverProduto*: Para remover um produto do estoque.
    - *AlterarProduto*: Para modificar algum produto do estoque.

- **visualizarEstoque(IVisualizarProduto visualizarProduto):** Para visualizar algum produto de alguma forma a ser específicada.
  Recebe um objeto que implemente a interface IVisualizarProduto. Assim, se
  novos tipos de visualização de produtos forem necessários, basta criá-los assinando IVisualizarProduto
  (Princípio Open/Closed do SOLID). As classes que assinam essa interface devem possuir um método que receba
  a lista de produtos do estoque (passada pelo prório método visualizarEstoque) e mostrem, de acordo com a 
sua finalidade, os produtos no console (métodos void).
  - **visualizarProduto**: É um objeto criado a partir de alguma classe que assine o contrato IVisualizarProduto. 
Temos três disponíveis:
    - *VerProdutoID*: Solicita que o usuário digite um ID de produto no estoque para que os dados desse produto seja exibido no console. 
    - *VerProdutosEstoque*: Exibe todos os produtos da lista recebida do estoque.
    - *VerProdutosEstoqueCategoria*: Exibe todos os produtos da lista recebida do estoque por categoria.

## Caixa
### Classe Caixa:
A classe Estoque possui apenas um atributo "dinheiroPresente;" que é um valor double contendo o valor presente
no caixa. Sua função é apenas armazenar o valor presente no caixa. Qualquer modificação nesse valor deve ser
feita através do método **interagirCaixa** e qualquer visualização de valor deve ser feita através do método **getDinheiroPresente**.

#### Médodos:
- **interagirCaixa:** Para provocar uma modificação do valor presente no caixa (atributo dinheiroPresente).
Recebe um objeto que implemente a interface IAcaoCaixa e o valor a ser trabalhado (dinheiroInteracao). Assim, se
  novos tipos de modificação de valores forem necessários, basta criá-los assinando IAcaoCaixa.
  (Princípio Open/Closed do SOLID). As classes que assinam essa interface devem possuir um método que receba
  o valor a ser trabalhado, e retornem novo valor que será somado ao valor do dinheiro presente no caixa pelo
  método interagirCaixa.
  Temos dois disponíveis:
  - *AdicionarCaixa*: Apenas retorna o dinheiroInteracao para ser somado ao valor presente no caixa; 
  - *SubtrairCaixa*: Retorna o dinheiroInteracao em valor negativo para ser somado ao valor presente no caixa (subtraído);

## Compra
### Classe Comprar:
A classe abstrata Comprar possui apenas um método público "comprar" e três métodos privados que são acessados
por esse método público.
#### Métodos:
- **comprar(Caixa caixa, Estoque estoque, Produto produto, int quantidadeComprada)**: Efetua as validações
necessárias através do método **"validarCompra"** e, se essas forem atendidas, efetua a compra através
do método **efetuarCompra**. Caso contrário, retorna ao usuário uma mensagem "Compra não efetuada!".
- **validarCompra(ArrayList<IValidarCompra> listaDeValidacoes, Produto produto)**: Recebe uma lista de
validações e um produto do método *comprar*. Se todas as validações forem atendidas, ele acionará o método *efetuarCompra*.
Se alguma validação da lista não for atendida, ele retornará
*false*, negando que a compra poderá ser efetuada. Cada validação presente na lista é uma classe que assina a 
interface **IValidarCompra**. Toda classe que assina esse contrato, recebe um produto como parâmetro e 
retorna *true* se a validação é atendida ou *false* caso contrário. Para cada validação da lista, o 
método valodarCompra dispara o método executar, fornecendo o produto como parâmetro. Assim, se
novas validações forem necessárias, basta criá-las assinando IValidarCompra (Princípio Open/Close do SOLID).
Temos uma validação disponível:

  - *VerificarProdutoAdulto*: Recebe um produto do método *validarCompra* e verifica se esse produto assina a 
interface **IAdulto**. Se este contrato é assinado por algum produto, significa que este é destinado ao 
público adulto. Caso positivo, ele solicita informações ao usuário, pelo console, para construir um **Comprador**.
Em seguida, ele aciona o método estático *executar* da classe abstrata **VerificarMaioridade**,
passando esse comprador como parâmetro. Se este método retornar *true*, ele retorna *true* ao método
*validarCompra*, caso contrário, retorna *false*.

- **calcularDescontos(ArrayList<ICalcularDesconto> listaDescontos, Produto produto, int quantidadeComprada):**
Método estático que recebe uma lista de objetos criados a partir de classes que assinam o 
contrato **ICalcularDesconto**. Classes que assinam esse contrato devem implementar um método 
*calcularDesconto(T produto, int quantidade)*, que recebe um produto e uma quantidade comprada como parâmetro
e retorna o valor do desconto a ser aplicado de acordo com suas regras específicas. Assim, se
novas regras de desconto forem necessárias, basta criá-las assinando **ICalcularDesconto**
(Princípio Open/Close do SOLID). Para cada tipo de desconto presente na listaDescontos, é disparado o método 
*calcularDesconto, incrementando a variável valorTotalDesconto, a cada iteração.
Temos um tipo de desconto disponível:
    1. *DescontoLivro:* Retorna o desconto de 15% do valor da compra se o produto for uma instância
       de Livro e se o valor total da compra for maior que 200.

- **efetuarCompra(Caixa caixa, Estoque estoque, Produto produto, int quantidadeComprada):**
  1. Subtrai a quantidade de produtos comprada (quantidadeComprada) do produto.
  2. Interage com o estoque através do método *interagirEstoque* passando o modificador *AlterarProduto* e o produto alterado
como parâmetro.
  3. Cria uma lista de desconto aplicáveis (ArrayList<'ICalcularDesconto>).
  4. Obtém o valor do desconto da compra executando o método *calcularDesconto* e passando
  a lista de descontos criada como parâmetro.
  5. Interage com o caixa através do método *interagirCaixa*, passando como parâmetro AdicionarCaixa() 
  6. (para que o valor seja acrescentado ao valor presente do caixa) e o valor da compra
    (valorCompra).
  7. Exibe as mensagens "Compra efetuada com sucesso!" e o valor disponível no caixa, após a compra.

##Execução
Um exemplo completo do funcionamento do sistema está disponível na classe "Main". Basta
executá-la para ver no console todos os seus resultados. Em alguns momentos, serão solicitadas
algumas informações do usuário no console para execução de alguns métodos.

##Melhorias:
1. O sistema ainda não contempla validações para as informações inseridas pelo usuário, no console;
2. Criação de um menu para interagir com o usuário.