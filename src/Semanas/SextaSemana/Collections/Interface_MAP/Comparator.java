package Semanas.SextaSemana.Collections.Interface_MAP;

import java.util.Comparator;
import java.util.Map;

class ComparatorNome implements Comparator<Map.Entry<String,Livros>> {

     @Override
     public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
         return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
     }
 }
class  ComparatorPaginas implements Comparator <Map.Entry<String, Livros>>{
    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}