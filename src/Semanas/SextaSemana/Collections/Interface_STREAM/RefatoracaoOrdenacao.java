package Semanas.SextaSemana.Collections.Interface_STREAM;

import java.util.*;

/*Dadas as seguintes informações de ID e contato crie um dicionário;
* Ordene este dicionário exibindo(NOME ID, NOM E CONTATO);

ID = 1- Conato = Nome:Simba, Numero 2222;
ID = 2- Conato = Nome:Cami, Numero 5555;
ID = 1- Conato = Nome:Jon, Numero 1111;
 */
public class RefatoracaoOrdenacao {
    public static void main(String[] args) {

        System.out.println("***\tOrdem Aleatória\t***");
        Map<Integer, Contatos> agenda = new HashMap<>() {{
            put(1, new Contatos("Simba", 2222));
            put(2, new Contatos("Cami", 5555));
            put(3, new Contatos("John", 1111));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contatos> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNome());
        }
        System.out.println("***\tOrdem de Inserção\t***");
        Map<Integer, Contatos> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contatos("Simba", 2222));
            put(2, new Contatos("Cami", 5555));
            put(3, new Contatos("John", 1111));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contatos> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNome());
        }
        System.out.println("***\tOrdem por ID\t***");
        Map<Integer, Contatos> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contatos> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNome());
        }
        // System.out.println("***\tOrdem por Número de Telefone\t***");

       /* Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contatos>>() {
            @Override
            public int compare(Map.Entry<Integer, Contatos> cont1, Map.Entry<Integer, Contatos> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());

            }
        });*/

        //Compare com Interface funcional:

       /* Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contatos>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contatos> cont) {
                return cont.getValue().getNumero();
            }
        }));*/

        //Comparação com Lambda:
        System.out.println("***\tOrdem por Número de Telefone\t***");
        //Comparação com Lambda:
        Set<Map.Entry<Integer, Contatos>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero())); //Método LAMBDA;
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contatos> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        //Comparação com Lambda:
        System.out.println("***\tOrdem por Nome\t***");
        Set<Map.Entry<Integer, Contatos>> setNome = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        setNome.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contatos> entry : setNome) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNome());
        }
    }
}


/*  class ComparatorOrdemNumerica implements  Comparator<Map.Entry<Integer, Contatos>>{
      @Override
      public int compare(Map.Entry<Integer, Contatos> cont1, Map.Entry<Integer, Contatos> cont2) {
          return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
      }
  }*/
class ComparatorNomeContato implements Comparator<Map.Entry<Integer, Contatos>> {

    @Override
    public int compare(Map.Entry<Integer, Contatos> cont1, Map.Entry<Integer, Contatos> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}


