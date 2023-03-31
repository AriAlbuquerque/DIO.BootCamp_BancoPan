package Semanas.EqualsHashCode.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros);

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));    //Offer tem a mesma função do add porém o offer se não obtém sucesso adicionando ele não dará erro, apenas retorna false;
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());    //Método peek ele pega o primeiro elemento da fila a cabeça, se estiver vazia ele retona null, e não remove o elemento;
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());        //Método pool ele pega o primeiro elemento da fila a cabeça, e retira esse elemento da lista;
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());      //Mostra se a fila está vazio;

        System.out.println(queueCarros.size());         //Mostra o tamanho da nossa fila

    }
}