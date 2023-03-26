package Semanas.SextaSemana.Collections.Interface_STREAM;

import java.util.Objects;

public class Contatos {

    private String nome;
    private Integer numero;

    public Contatos(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return nome.equals(contatos.nome) && numero.equals(contatos.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Nome='" + nome + '\'' +
                ", Número=" + numero +
                '}';
    }
}
