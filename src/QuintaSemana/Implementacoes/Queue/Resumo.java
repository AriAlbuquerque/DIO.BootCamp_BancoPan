package QuintaSemana.Implementacoes.Queue;

public class Resumo {
    /*
    *  *********Queue*************
    * As interfaces QUEUE são as filas das estruturas de dados em JAVA;

    * Usamos o LinkedList<> para fazer a implementação da nossa lista;
    * Exemplo--->     Queue<Carro> queueCarros = new LinkedList<>();

    * *Principais Métodos:

    *      .add();
    *
    *      .elemento();
    *
    *      .offer(); (Offer tem a mesma função do add porém o offer se não obtém sucesso adicionando ele não dará erro, apenas retorna false);
    *
    *      .peek();  (Método peek ele pega o primeiro elemento da fila, não remove o elemento e se estiver vazia ele retona null,)
    *
    *      .remove();
    *
    *      .poll(); (Método pool pega o primeiro elemento da fila a cabeça e retira esse elemento da lista);
    *
    *      .isEmpty();  (Mostra se a fila está vazia);
    *
    *      .isEmpty(); (Mostra se a fila está vazia);

    **********************************************************************
    * package QuintaSemana.Implementacoes.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();           //Criação da classe Queue com auxílio do método LINKEDLIST;

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros);

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));    //Offer tem a mesma função do add porém o offer se não obtém sucesso adicionando ele não dará erro, apenas retorna false;
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());    //Método peek ele pega o primeiro elemento da fila, não remove o elemento e se estiver vazia ele retona null,
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());        //Método pool ele pega o primeiro elemento da fila a cabeça, e retira esse elemento da lista;
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());      //Mostra se a fila está vazio;

        System.out.println(queueCarros.size());         //Mostra o tamanho da nossa fila



    }



}
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}
