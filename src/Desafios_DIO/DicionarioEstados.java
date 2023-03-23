package Desafios_DIO;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class DicionarioEstados {
    public static void main(String[] args) {

        Map<String, Integer> populacaoEstadoNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Dicionario Criado:\n" + populacaoEstadoNE);
        System.out.println("\n");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoEstadoNE.put("RN", 3534165);
        System.out.println(populacaoEstadoNE);
        System.out.println("\n");

        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        populacaoEstadoNE.put("PB", 4039277);
        System.out.println(populacaoEstadoNE);
        System.out.println("\n");

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadosNE2);
        System.out.println("\n");


        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadoNE);
        System.out.println(populacaoEstadosNE3);

        Collection<Integer> populacao = populacaoEstadoNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadoNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.println("\n");

        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadoNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\n");

        System.out.println("Exiba a soma da população desses estados: " + soma);
        int soma2 = 0;
        for (Map.Entry<String, Integer> entry : populacaoEstadoNE.entrySet()) {
            soma2 += entry.getValue();
        }

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacaoEstadoNE.size()));
        System.out.println("\n");

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadoNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadoNE);
        System.out.println("\n");


        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadoNE.clear();
        System.out.println(populacaoEstadoNE);
        System.out.println("\n");


        System.out.println("Confira se a lista está vazia: " + populacaoEstadoNE.isEmpty());

    }
}
