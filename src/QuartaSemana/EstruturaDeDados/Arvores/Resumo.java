package QuartaSemana.EstruturaDeDados.Arvores;

public class Resumo {

    /**
     * ************ Árvores *************
     * Árvores são estruturas de dados BIDIMENSIONAIS;
     * ** NÃO LINEARES;***
     *  Constituidas de nós(node) que representam modelos:  hierárquico ||  por parênteses aninhados || por inclusão;;
     *
     * Características de uma ÀRVORE HIERÁRQUICA:

     * 1-Nó(node): Elemento da árvore que pode armazenar dados e referências para outros nós;

     * 2-Raiz: Nó Principal da árvore, origem de todas as demais ramificações;

     * 3-Pai e filho: Em dois nós interligados o decendente direto é o filho seu ancestral é o pai;

     * 4-Irmão: Nós com mesmo pai são ditos irmãos;

     * 5-Nível de um nó(node): Posição hierárquica com relação a raiz sendo 0 mais alto nível hierárquico;

     * 6-Altura ou profundidade: Grau máximo dos nós(node):

     * 7-Folha ou nó terminal: Últimos nós da árvore, os nós que não tem filhos sempre apotam para null;

     * 8-Nó interno:

     * 9-Grau de um nó: Definido pelo número de seus filhos;

     *10-Subárvores: Formada a partir de um nó da árvore principal, sendo considerada um ramo;
     *
     ******Tipos de árvores ******
     * Árvore binária;
     * Árvore AVL;
     * Árvore Ordenada;
     * Árvore Rubro Negra;
     * Árvore 2-3;
     * Árvore 2-4;
     * Árvore B;
     * Árvore B+;
     * Árvore Hiperbólica;
     *
     * *************Árvore de Busca Binária ******************
     * Árvore de busca binária sua principal caracteristica é a posição dos nós;
     * Os NÓS tem suas posições: MAIORES À DIREITA && MENORES À ESQUERDA do Nó principal;
     *
     * O nó da árvore binária será semelhante ao nó das listas duplamente encadeadas:
     * Temos um nó com uma área para dado útil e dois nós de referências um apontando para o nó á esquerda e outro para direita;
     *
     * **** Interface Comparable: Irá fazer comparações para indicar se o conteúdo 1 < || > conteúdo 2 e indicar sua locação á esquerda ou direita;
     *
     ex:
          public interface Comparable<T>{
             public int compareTo(T o);
     }
     *
     * **********Atravessamento em Árvore************
     * 1-IN-OEDEM: Retorma o valor a esquerda, exibe o nó  e visita o nó a direita, em ordem crescente, iniciando á esquerda;
     * 2-PRÉ-ORDEM: Primeiro exibe o nó depois para esquerda e a direita e retorna no looping exibindo.
     * 3-PÓS-ORDEM: Visita primeiro os nós á esquerda e direita, depois retorna;
     */

}
