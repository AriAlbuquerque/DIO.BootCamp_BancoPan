package Semanas.SextaSemana.Collections.Interface_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();       //Criando uma Interface ArrayList;
        notas.add(7.0);                               //Método para add elemento;
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba posição da nota 5.0: " + notas.indexOf(5d));   //Mostra a posição do elemento;

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);                                         //Add elemento em posição determinada;
        System.out.println(notas);

        System.out.println("Substritua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);                                   //Substutui elemento 5d de dua posição e o substituiu por 6d;
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));         //Método que mostra se contém elemento solicitado na lista;

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);     //Exibirá as notas uma a baixo da outra na posição que foram inseridas;
        ;

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));        //Método get mostrará o elemento contido na posição 2;
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));         //Interface Collections.min() irá mostrar menor elemento contido na lista;

        System.out.println("Exiba a maior nota: " + Collections.max(notas));        //Interface Collections.max() irá mostrar maior elemento contido na lista;

        System.out.println("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();        //Para realizar uma soma utiliza-se do método iterator;
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));         //Média pode ser calculada com a soma sendo dividida pelo tamanho da lista;

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);                 //Remore elemento;
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);            //Remove posição da lista (index);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
