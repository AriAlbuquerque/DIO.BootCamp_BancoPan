package Semanas.SextaSemana.Collections.Interface_SET;

import java.util.*;

public class Exemplo01_Set {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));  //Criando um Set de notas implementando HashSet;
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));    //Método contains verifica se elemento está presente no conjunto;

        System.out.println("Exiba a menor nota: " + Collections.min(notas));  //Como Set é parte das Collections podemos verificar através do Collections.min(elemento/parâmetro));

        System.out.println("Ebiba a maior nota: " + Collections.max(notas)); //Verificação através do Collections.max(notas));

        //Somar valores da coleção; * Itens duplicados não serão considerados na soma;
        Iterator<Double> iterator = notas.iterator();   //Criação da variável iterator;
        Double soma = 0.0;   //Variável de controle;
        while (iterator.hasNext()) {      //Inicio do laço de repetição condição hasNext;
            Double next = iterator.next();  //Variável de controle;
            soma += next; //Método somar itens do conjunto;
            System.out.println("Exiba a soma dos valores: " + soma);

            System.out.println("Exiba a média das notas: " + (soma / notas.size()));  //Soma / por tamanho da coleção;

            System.out.println("Remova a nota 0: ");
            notas.remove(0d);

            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = notas.iterator();  //Variável local;
            while (iterator1.hasNext()) {         //Laço de repetição verificando se há próximo no conjunto;
                Double next1 = iterator1.next();  //Variável local de controle;
                if (next1 < 7) iterator1.remove();  //Condição se variável < 7 remova;
                System.out.println(notas);
            }

            System.out.println("Exiba todas as notas na ordem que foram informadas: ");
            Set<Double> notas2 = new LinkedHashSet<>();    //Para informar a ordem de inserção temos que iniciar o LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
            System.out.println(notas2); //O elemento duplicado só aparecerá uma vez;

            //Exiba as notas em ordem crescente:
            System.out.println("Notas em ordem Crescente: ");
            Set<Double> notas3 = new TreeSet<>(notas2); //Implementação de "TreeSet", pois ela organiza os elementos da coleção por ordem natural dos elementos;
            System.out.println(notas3);

            System.out.println("Apague todo o conjunto:");
            notas.clear();
            System.out.println(notas);

            //Verifique se as listas estão vazias:
            System.out.println("Verifique se o conjunto 2 está vazio:" + notas2.isEmpty());
            System.out.println(notas2);
            System.out.println("verifique se o conjunto 1 está vazio: " + notas.isEmpty());
            System.out.println(notas);
        }
    }

}