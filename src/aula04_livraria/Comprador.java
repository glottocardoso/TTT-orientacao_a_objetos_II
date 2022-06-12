package aula04_livraria;

import java.time.LocalDate;
import java.util.Date;

public class Comprador {
    String nome;
    String rg;
    String cpf;
    LocalDate dataNascimento;

    public Comprador(String nome, String rg, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
}
