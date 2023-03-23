package Semanas.SextaSemana.Collections.Interface_MAP;

import java.util.*;

/*Crie um dicionário com as seguintes informações:
* Livros favoritos:
* Nome Autor / Nome Livro
* Autor: Hahari Yuval Noah / Livro: Sapiens uma breve história da humanidade / Páginas 464;
* Autor: Caio Túlio Costa  / Livro: Cale-se / Páginas 314;
* Autor: George Orwell / Livro: 1984 / Páginas 277;  */
public class Ordenacao_MAP {

    public static void main(String[] args) {

        //Ordem Aleatória HashMap
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>(){{    //Para Ordem Aleatória usamos o HashMap;
            put("Hahari Yuval Noah ", new Livros("Sapiens uma breve história da humanidade", 464));
            put("Caio Túlio Costa ", new Livros("Cale-se", 465));
            put("George Orwell", new Livros("1984", 277));
        }};
        for (Map.Entry<String, Livros> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + ": " + livro.getValue().getNome());

        System.out.println("\n");

        System.out.println("--\tOrdem Inserção\t--");

        //Ordem de inserção  LinkedHashMap:
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
            put("Hahari Yuval Noah ", new Livros(" Sapiens uma breve história da humanidade", 464));
            put("Caio Túlio Costa ", new Livros(" Cale-se", 465));
            put("George Orwell", new Livros(" 1984", 277));
        }};
        for (Map.Entry<String, Livros> livro : meusLivros1.entrySet())
        System.out.println(livro.getKey() +": " + livro.getValue().getNome());

        System.out.println("\n");

        //Ordem de Natural TreeMap
       System.out.println("--\tOrdem Alfabética por Autor\t--");
       Map<String, Livros>  meusLivros2 = new TreeMap<>(meusLivros1);
        for( Map.Entry<String, Livros> livro: meusLivros2.entrySet())
       System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        System.out.println("\n");

        //Ordenação por ordem natural TreeMap;

        System.out.println("--\tOrdem Alfabética por nome dos livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome ());    //Usamos TreeSet para imprimir em ordem natural;
        meusLivros3.addAll(meusLivros.entrySet()); //Adiciona todod os elementos do dicionario meusLivros;
        for( Map.Entry<String, Livros> livro : meusLivros3)
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        System.out.println("\n");

        System.out.println("--\tOrdem por número de páginas: \t--");
        Set<Map.Entry<String, Livros>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros1.entrySet());
        for( Map.Entry<String, Livros> livro : meusLivros4)
            System.out.println(livro.getKey() + ": " + livro.getValue().getPaginas());
        System.out.println("\n");
    }


}
