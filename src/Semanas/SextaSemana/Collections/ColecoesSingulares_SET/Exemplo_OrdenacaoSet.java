package Semanas.SextaSemana.Collections.ColecoesSingulares_SET;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre séries favoritas,
crie um conjunto e ordene esse conjunto exibindo:
(Nome - Genero - duração do episódio);

Série 1: Nome GOT, Genero Fantasia, Duração episódio 60min;
Série 2: Nome Dark, Genero Drama, Duração episódio 60min;
Série 3: Nome That 's70 show, Genero Comédia, Duração episódio 25min;

* */
class Exemplo_OrdenacaoSet {
    public static void main(String[] args) {

        //Exiba a coleção de forma aleatória: HASHSET;
        System.out.println("--\t************ Ordem Aleatória\t************--");
        Set<Series> minhasSeries = new HashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That 's70 show", "Comédia", 25));

        }};
        for (Series series : minhasSeries) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getDuracaoEpisodio());

        }
        //Exiba a coleção por ordem de inserção: LinkedHashSet;
        System.out.println("************ Ordem de inserção ************");
        Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Series("Got", "Fantasia", 60));
            add(new Series("Dark", "Drama", 60));
            add(new Series("That 's70 show", "Comédia", 25));
        }};
        for (Series series : minhasSeries1) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getDuracaoEpisodio());
        }

        //Exiba a coleção em ordem natural (Tempo de Episódio): TreeSet
        System.out.println("************ Ordem Natural ************");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Series series : minhasSeries2) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getDuracaoEpisodio());

        }

        System.out.println("************ Ordem por Nome/Genero/DuraraçãoEpisódios ************");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroDuracaoEpisodio());
        //Add elementos na coleção com addAll que recebe uma Collection:
        minhasSeries3.addAll(minhasSeries);

        for (Series series : minhasSeries3) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getDuracaoEpisodio());

        }


    }


}
