package Semanas.QuintaSemana.Implementacoes.equalsHashCode;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class MainCarros {

    public static void main(String[] args) {

        Carro carro = new Carro();
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Chevrolet"));
        listaCarro.add(new Carro("Volkswagen"));

        System.out.println(listaCarro);

        System.out.println(listaCarro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Chevrolet").hashCode());
        System.out.println(new Carro("Volkswagen").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
        System.out.println(listaCarro);
        listaCarro.add(new Carro("Volkswagen"));
        System.out.println(listaCarro);


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



