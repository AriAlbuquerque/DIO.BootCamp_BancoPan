package Desafios_DIO;

import java.util.*;

/*Crie um CONJUNTO contendo as cores do arco-iris:
1-Exiba todas as cores uma abaixo da outra;
2-A quantidade de cores que um arco iris tem;
3-Exiba as cores em ordem alfabética;
4-Exiba as cores na ordem inversa que foramm informadas;
5-Exibam todas as cores que começam com a letra "V"
6-Remora todas as cores que não começam com a letra "V";
7-limpe o CONJUNTO;
8-Confira se o conjunto está vazio;*/
public class CoresArcoIris {
    public static void main(String[] args) {

        System.out.println("*********** Crie um conjunto contendo as cores do arco-íris *********** ");
           //Criando um conjunto com HashSet:
        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");

        System.out.println(coresArcoIris);
        //Para ordenar os elementos um abaixo do outro use forEach:
        System.out.println("*** Exiba todas as cores o arco-íris uma abaixo da outra *** ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("*** Quantidade de cores do arco-íris: " + coresArcoIris.size());

        System.out.println("*** Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("*** Exiba as cores na ordem inversa que foram informadas: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("*** Cores que começam com a letra (V): ");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("V"))
                System.out.println(cor);
        }

        System.out.println("*** Remova todas as cores que não começam com (V):");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()){
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
