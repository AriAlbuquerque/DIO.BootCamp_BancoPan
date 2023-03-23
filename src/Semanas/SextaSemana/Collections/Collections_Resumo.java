package Semanas.SextaSemana.Collections;

public class Collections_Resumo {

    /*
         *******  Collections_Resumo ******
         *
        É a interface absoluta na hierarquia de coleções. Dela descendem as interfaces Set, Queue (filas) e List (listas) que formam a base das coleções genéricas da linguagem Java.

        > Set – define uma coleção que não contém valores duplicados.
        > Queue – define uma coleção que representa uma fila, ou seja, implementa o modelo FIFO (First-In, First-Out)
        > List - define uma coleção ordenada que pode conter elementos duplicados.

         * Collectons são objetos que agrupam múltiplos elementos(Váriáveis primitvas ou objetos) em uma única unidade;
         * Serve para armazenar, modelar e processar conjunto de dados de forma eficiente;

         Uma Collection é composta por:

         * Interfaces---> É um contrato que quando assumido por uma classe deve ser implementado;
         * A maioria das coleções em Java derivam da interface java.util.Collection, que define métodos comuns entre todas elas com o objetivo de padronizar muitas das operações básicas suportadas em cada tipo de coleção;

         -Iterator<E> iterator(): retorna um Iterator para percorrer os elementos da coleção. Uma coleção pode ser percorrida por um Iterator usando o for melhorado;
         -boolean add(E e): adiciona um elemento à coleção;
         -boolean addAll(Collection<? extends E> c): adiciona à coleção todos os elementos da coleção passada como parâmetro;
         -void clear(): Esvazia essa collection, mas não elimina da memória os objetos que ela referenciava, a não ser que não haja mais nenhuma outra referência para os mesmos;
         -boolean contains(Object o): retorna true se a coleção contém o elemento informado como parâmetro;
         -boolean containsAll(Collection<?> c): retorna true se a coleção contém todos os elementos da coleção informada como parâmetro;
         -boolean isEmpty(): retorna true se a coleção não tem elementos;
        - boolean remove(Object o): remove da coleção o elemento informado como parâmetro;
        - boolean removeAll(Object o): remove da coleção todos os elementos da coleção informada como parâmetro;
        - int size(): Retorna a quantidade de elementos da coleção;
        - Object[] toArray(): converte essa coleção para um array de Object.

         * Implementações ou Classes---> São as materializações, a codificação das insterfaces;
         * Algoritmos---> Sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema;

         * Hierarquia do Collections Frameworks--->
         * A interface: java.util.Iterable está no topo da hierarquia de interfaces do framework,
          sua principal função é definir que qualquer coleção filha seja iterável pelo laço de repetição for each == “for melhorado”;
          Para isso, ela disponibiliza alguns métodos;
           Método principal:
           * iterator(); que retorna um objeto que implementa a interface Iterator;

         * Através da interface java.util.Iterator pode-se percorrer qualquer coleção facilmente, pois além da vantagem de se usar o for each == “for melhorado”, é uma interface que define alguns métodos que permitem percorrer qualquer tipo de coleção;
                 Os principais métodos são:
         * boolean hasNext(): retorna true se existem mais elementos a serem acessados na coleção vinculada a esse Iterator;
         * next(): retorna o próximo elemento disponível na coleção vinculada a esse iterator;
         * void remove(): remove da coleção o último elemento acessado através desse Iterator.


      **************** List ****************

         * A interface List permite---> elementos duplicados e garante ordem de inserção;

        * A interface java.util.List tem o objetivo de definir coleções, que têm a função de servirem como arrays de tamanho dinâmico,
     de forma que cada elemento seja acessível por um índice, que é a posição do elemento no array;
       Além disso, novos elementos podem ser criados ou removidos em qualquer posição e pode haver elementos duplicados.

                * As principais classes que descendem da interface List são ArrayList, Vector, LinkedList e Stack;
         * Vector---> Implementação thread para true add safe;
         * ArrayList---> Utiliza um Array; Deve ser utilizado quando mais operações de pesquisa são necessários;
         * LinkedList---> Utiliza Lista duplamente ligada; Deve ser utilizado quando operações de inserção e exclusão são mais necessários;
         * Stack---> Cria pilhas de estruturas de dados com utilização do método LIFO.

      ****************Interface SET******************

       Na Interface SET não é possível fazere pesquisas, pois uma das suas principais características é:
       * Não possuir indice e Não permitir elementos duplicados;

             * HashSet---> Exibe a coleção de forma aleatória, ja que não possui índice;
             * LinkedHashSet---> Exibe a coleção por ordem de inserção;
             * TreeSet---> Exibe a coleção em ordem natural;

      **************** Interface MAP ****************

       A Interface MAP não estende da Interface Collection, o MAP é um objeto que faz parte do Framework;
      Neste Objeto podemos armazenar diversos tipos de dados como variáveis primitivas;
      O MAP mapeia valores para chaves, ou seja, através da chave consegue ser acessado o valor configurado,
      Os objetos “Map” confiam seus dados em um algoritmo hash (hash code).
      Esse algoritmo transforma uma grande quantidade de dados em uma pequena quantidade de informações, sendo que o mecanismo de busca se baseia na construção de índices.

      * Todo elemento no MAP tem uma chave (Key) e um valor (value);
       As chaves nunca poderão ser repetidas ja os valores podem se repetir;

             * HashMap---> Exibe o dicionário de forma aleatória;Essa classe é a implementação da interface Map mais trabalhada no campo de desenvolvimento:
             1-Devido seus elementos não serem ordenados;
             2-Rápida na busca/inserção de dados;
             3-Permite inserir valore e chaves nulas;

             * LinkedHashMap---> Exibe o dicionário de acordo com a ordem de inserção;

             * TreeMap---> Exibe o dicionário de acordo com a ordem natural das chaves(KEYS), O MAP possui sua ordenação por "ordem natural" assim como no set;


 **************** Interface STREAM API ****************



        *Classe Anônima---> è uma classe em JAVA que não recebe nome e é declada e instaciada em uma única instrução;
       Sempre que precisar criar uma classe que será instanciada apenas uma vez; Ex: Interface Comparator Gato/Idade;

       * Functional Interface---> Qualquer Interface com um SAM(Single Abstract Method), interface funcional que pode ser tratada como expressões lambda;
             EX:      @FunctionalInterface
                    public Interface Comapartor<T> {
                      @Contract(pure = true) int compare( T var1, T var2);

          * Comparator--->
          * Consumer--->
          * Function--->
          * Predicate--->

    ******* Função LAMBDA:
    É uma função sem declaração, ou seja não precisa de nome, tipo de retorno e o modificador de acesso;
    A idéia é que o método seja declarado no mesmo lugar em que será usado.
    As funções lambda em JAVA tem a síntaxe definida como:  (ARGUMENTO) -> (CORPO);

            EX:  meusGatos.sort(Comparator.comparing(Gato gato) -> gato.getNome()));

    ******* Refrence Method:
    Recurso que permite fazer referência a um método ou construtor de uma classe(de forma funcional),
   e assim indicar que ele será utilizado em um ponto específico do código, deixando mais sim0ples e legível;
   Para utiliza-lo basta informar uma classe ou referência seguida do símbolo :: e o nome do método sem () no final;

            EX:  meusGatos.sort(Comparator.comparing(Gato :: getNome));












    */


}
