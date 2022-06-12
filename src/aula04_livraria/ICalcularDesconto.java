package aula04_livraria;

public interface ICalcularDesconto {
    <T extends Produto> double calcularDesconto(T produto, int quantidade);
}
