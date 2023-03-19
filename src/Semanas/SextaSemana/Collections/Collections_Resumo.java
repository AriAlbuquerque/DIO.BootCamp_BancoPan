package Semanas.SextaSemana;

public class Collections_Resumo {

    /*
    *******  Collections_Resumo Frameworks ******

    * Collectons são objetos que agrupam múltiplos elementos(Váriáveis primitvas ou objetos) em uma única unidade;
    * Serve para armazenar, modelar e processar conjunto de dados de forma eficiente;

    Uma Collection é composta por:

    * Interfaces---> É um contrato que quando assumido por uma classe deve ser implementado;
    * A maioria das coleções em Java derivam da interface java.util.Collection, que define métodos comuns entre todas elas com o objetivo de padronizar muitas das operações básicas suportadas em cada tipo de coleção;

    -boolean add(E e): adiciona um elemento à coleção;
    -boolean addAll(Collection<? extends E> c): adiciona à coleção todos os elementos da coleção passada como parâmetro;
    -void clear(): Esvazia essa collection, mas não elimina da memória os objetos que ela referenciava, a não ser que não haja mais nenhuma outra referência para os mesmos;
    -boolean contains(Object o): retorna true se a coleção contém o elemento informado como parâmetro;
    -boolean containsAll(Collection<?> c): retorna true se a coleção contém todos os elementos da coleção informada como parâmetro;
    -boolean isEmpty(): retorna true se a coleção não tem elementos;
    -Iterator<E> iterator(): retorna um Iterator para percorrer os elementos da coleção. Uma coleção pode ser percorrida por um Iterator usando o for melhorado;
   - boolean remove(Object o): remove da coleção o elemento informado como parâmetro;
   - boolean removeAll(Object o): remove da coleção todos os elementos da coleção informada como parâmetro;
   - int size(): Retorna a quantidade de elementos da coleção;
    - Object[] toArray(): converte essa coleção para um array de Object.


    * Implementações ou Classes---> São as materializações, a codificação das insterfaces;
    * Algoritmos---> Sequ~encia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema;

    * Hierarquia do Collections Frameworks--->
    * A interface: java.util.Iterable está no topo da hierarquia de interfaces do framework,
     sua principal função é definir que qualquer coleção filha seja iterável pelo laço de repetição “for melhorado”;
     Para isso, ela disponibiliza alguns métodos;
      Método principal:
      * iterator(); que retorna um objeto que implementa a interface Iterator;

    * Através da interface java.util.Iterator pode-se percorrer qualquer coleção facilmente, pois além da vantagem de se usar o “for melhorado”, é uma interface que define alguns métodos que permitem percorrer qualquer tipo de coleção;
       Os principais métodos são:
    * boolean hasNext(): retorna true se existem mais elementos a serem acessados na coleção vinculada a esse Iterator;
    * next(): retorna o próximo elemento disponível na coleção vinculada a esse iterator;
    * void remove(): remove da coleção o último elemento acessado através desse Iterator.


    ****** List *****

    * A interface List permite---> elementos duplicados e garante ordem de inserção;

   * A interface java.util.List tem o objetivo de definir coleções que têm a função de servirem como arrays de tamanho dinâmico, de forma que cada elemento seja acessível por um índice, que é a posição do elemento no array;
    Além disso, novos elementos podem ser criados ou removidos em qualquer posição e pode haver elementos duplicados.

    * Vector---> Implementação thread para true add safe;
    * ArrayList---> Utiliza um Array;
    - Deve ser utilizado quando mais operações de pesquisa são necessários;
    * LinkedList---> Utiliza Lista duplamente ligada;
    - Deve ser utilizado quando operações de inserção e exclusão são mais necessários;



    As principais classes que descendem da interface List são ArrayList, Vector, LinkedList e Stack;

    - void add(int index, E element): Insere o elemento especificado na posição passada como parâmetro;
    - E get (int index): Retorna o elemento de uma posição especificada;
    - Int indexOf(Object o): Retorna a posição do objeto passado como parâmetro. Se o objeto não existe, retorna -1;
    - E remove(int index): Remove o elemento presente no índice indicado como parâmetro;
    - E set(int index, E element): Faz com que o objeto informado como parâmetro ocupe a posição informada no parâmetro index. Se a posição já estiver ocupada, substitui o valor presente;












     */


}
