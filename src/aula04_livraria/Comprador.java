package aula04_livraria;

import java.time.LocalDate;
import java.util.Date;

public class Comprador {
    String nome;
    String rg;
    String cpf;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public Comprador(String nome, String rg, String cpf, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }
}
