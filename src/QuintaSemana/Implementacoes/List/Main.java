package QuintaSemana.Implementacoes.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros);

        System.out.println(listCarros.contains(new Carro("Ford")));   //Mostra se contém item na lista;

        System.out.println(listCarros.get(2));   //Mostra o indice 2 da minha lista;

        System.out.println(listCarros.indexOf(new Carro("Fiat")));     //Mostra a posição do meu elemento na lista;

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
