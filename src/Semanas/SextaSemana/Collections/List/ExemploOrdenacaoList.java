package Semanas.SextaSemana.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {


        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));

        }};
        System.out.println(meusGatos);

        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatótia: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de idade: ");
        Collections.sort(meusGatos, new Gato.ComparetorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem cor: ");
        meusGatos.sort(new Gato.ComparetorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome, Cor, Idade: ");
        meusGatos.sort(new Gato.ComparetorNomeCorIdade());
        System.out.println(meusGatos);
    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    static class ComparetorIdade implements Comparator<Gato>{
        @Override
        public int compare(Gato o1, Gato o2) {
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }
    static class ComparetorCor implements Comparator<Gato>{
        @Override
        public int compare(Gato o1, Gato o2) {
            return o1.getCor().compareToIgnoreCase(o2.getCor());
        }
    }
    static class ComparetorNomeCorIdade implements Comparator<Gato>{
        @Override
        public int compare(Gato o1, Gato o2){
            int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
            if(nome != 0)
                return nome;

            int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
            if(cor != 0)
                return cor;

            return Integer.compare(o1.getIdade(), o2.getIdade());
        }

    }
}
