package aula04_livraria;

public interface IValidarCompra<T extends Produto>{
    <T extends Produto> boolean executar(T produto);
}
