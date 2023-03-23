package Semanas.SextaSemana.Collections.Interface_MAP;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("*****Crie um dicionário que relacione os modelos e seus respectivos valores de consumo ***** ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{    //Criando método HASHMAP da Interface MAP;
           put("Gol", 14.4);                    //No Map utilizamos PUT para inserção de elementos, sempre com Key e Vallue;
           put("Uno", 15.6);
           put("Mobi", 16.1);
           put("HB20", 14.5);
           put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("\n");

        System.out.println("* Substitua o consumo do Gol por 16,1 km/l: ");
        System.out.println(carrosPopulares.toString());

        carrosPopulares.put("Gol", 16.1);   //No Map altera-se o valor da key apenas passando seu novo value;

        System.out.println(carrosPopulares.toString());
        System.out.println("\n");

        System.out.println("* Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
        System.out.println("* Confira se o modelo Uno está no dicionário: " + carrosPopulares.containsKey("Uno"));
        System.out.println("\n");

        System.out.println("* Exiba o consumo do UNO: " + carrosPopulares.get("Uno"));
        System.out.println("\n");

        System.out.println("* Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);


        System.out.println("* Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);
        System.out.println("\n");

        System.out.println("* Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais econômico: " + modeloMaisEficiente + " Consumo: " + consumoMaisEficiente);
        System.out.println("\n");

        System.out.println("* Exiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(" Modelo menos econômico: " + modeloMenosEficiente + " Consumo: " + consumoMenosEficiente);
                System.out.println("\n");
            }
        }

        //Exiba a soma dos consumos:
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("* Exiba a soma dos consumos: " + soma);

        System.out.println("* Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        System.out.println("\n");

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com consumo igual a 15.6 Km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares.toString());
        System.out.println("\n");

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
       Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{  //Criando método LinkedHashMap da Interface MAP para verificar a biblioteca por ordem de inserção;
           put("Gol", 14.4);
           put("Uno", 15.6);
           put("Mobi", 16.1);
           put("HB20", 14.5);
           put("Kwid", 15.6);
       }};
        System.out.println(carrosPopulares1.toString());
        System.out.println("\n");

        System.out.println("Exiba o dicionário ordenado por modelo: ");

        Map<String, Double> carrospopulares2 = new TreeMap<>(carrosPopulares1);  //Criando método TreeMap da Interface MAP para verificar a biblioteca por ordem de inserção da Key (Ordem natural);
        System.out.println(carrospopulares2.toString());
        System.out.println("\n");

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());


    }
}
