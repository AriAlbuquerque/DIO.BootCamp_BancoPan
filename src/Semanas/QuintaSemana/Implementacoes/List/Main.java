package Semanas.EqualsHashCode.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Carros2> listCarros = new ArrayList<>();

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
public class Carro {
    public Carro(String marca) {
        this.marca = marca;
    }

    String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}


