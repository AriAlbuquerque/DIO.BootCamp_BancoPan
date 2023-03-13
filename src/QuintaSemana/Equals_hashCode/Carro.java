package QuintaSemana.Equals_hashCode;

import java.util.Objects;

public class Carro {

    String marca;


    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Testando se obj é igual o parametro se sim retorno true;
        if (o == null || getClass() != o.getClass()) return false; //Retorna se obj é nullo ou obj e classes diferentes retur false;
        Carro carro = (Carro) o; //Casting de obj
        return Objects.equals(marca, carro.marca); //Retorno levando em consideração atributo marca;
    }

    @Override
    public int hashCode() {         //Retorna numero inteiro um "hash" gerado atraves do atributo marca;
        return Objects.hash(marca);
    }
}
