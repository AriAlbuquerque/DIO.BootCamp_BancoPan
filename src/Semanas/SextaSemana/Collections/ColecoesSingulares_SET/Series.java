package Semanas.SextaSemana.Collections.ColecoesSingulares_SET;

import java.util.Comparator;
import java.util.Objects;


class Series implements Comparable<Series> {      //Criando class Series;
    private String nome;
    private String genero;
    private Integer duracaoEpisodio;

    //Método construtor;
    public Series(String nome, String genero, Integer duracaoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoEpisodio = duracaoEpisodio;
    }

    //Criando os getters;
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    //Método toString;
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoEpisodio=" + duracaoEpisodio +
                '}';
    }

    //Gerando equals and Hashcode:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && duracaoEpisodio.equals(series.duracaoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracaoEpisodio);
    }

    //Realizando comparação entre duração de episódio, se forem iguais comparar por genero;
    @Override
    public int compareTo(Series series) {
        int duracaoEpisodio = this.getDuracaoEpisodio().compareTo(series.getDuracaoEpisodio());
        if (duracaoEpisodio != 0)
            return duracaoEpisodio;
        return this.getGenero().compareTo(series.getGenero());

    }
}

//Classe para comparar Nome genero e duração do episódio:
class ComparatoNomeGeneroDuracaoEpisodio implements Comparator<Series> {
    @Override
    public int compare(Series s1, Series s2) {
        //Se nome for == --->
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0)
            return nome;
        //-->Comapre por genero:
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0)
            return genero;
        //Se nome e genero forem iguais comppare com duração do episódio;
        return Integer.compare(s1.getDuracaoEpisodio(), s2.getDuracaoEpisodio());
    }
}
