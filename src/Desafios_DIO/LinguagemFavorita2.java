package Desafios_DIO;

import java.util.*;

/*Na classe linguagem favorita crie os atributos:
1-Nome;
2-Ano de Criação;
3-IDE's
4-Crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
A) Ordem de inserção:
B)Ordem Natural(NOME)
C)IDE
D)Ano de criação e nome
E)Nome, ano de criação e IDE
****Ao final exiba as línguagens no console uma abaixo da outra:*/
class LinguagemFavorita {
    public static void main(String[] args) {
        Set<LinguagemFavorita2> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita2("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita2("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita2("Java", 1991, "Visual Studio Code"));

        System.out.println("**********\tOrdem de Inserção\t**********");
        Set<LinguagemFavorita2> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita2("Python", 1991, "Pycharm"),
                        new LinguagemFavorita2("JavaScript", 1995, "IntelliJ"),
                        new LinguagemFavorita2("Java", 1991, "Visual Studio Code")
                )
        );
        for (LinguagemFavorita2 linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println("***** Ordem Natural(Nome) *****");
        Set<LinguagemFavorita2> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita2 linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita2> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita2>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita2 linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita2> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita2>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita2 linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita2> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita2>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita2 linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

    }
}

class LinguagemFavorita2 implements Comparable<LinguagemFavorita2> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita2(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    @Override
    public String toString() {
        return "{" +
                "Nome='" + nome + '\'' +
                ", AnoDeCriacao=" + anoDeCriacao +
                ", IDE='" + ide + '\'' +
                '}';
    }
    @Override
    public int compareTo(LinguagemFavorita2 linguagemFavorita2) {
        return this.nome.compareTo(linguagemFavorita2.nome);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita2 that = (LinguagemFavorita2) o;
        return nome.equals(that.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita2> {

    @Override
    public int compare(LinguagemFavorita2 lf1, LinguagemFavorita2 lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita2> {
    @Override
    public int compare(LinguagemFavorita2 lf1, LinguagemFavorita2 lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita2> {
    @Override
    public int compare(LinguagemFavorita2 lf1, LinguagemFavorita2 lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
