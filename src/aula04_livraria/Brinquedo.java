package aula04_livraria;

public class Brinquedo extends Produto{
    String tipo;

    public Brinquedo() {

    }

    public Brinquedo(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "ID=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
