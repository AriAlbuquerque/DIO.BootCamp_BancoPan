package QuintaSemana.Implementacoes.Queue;
import java.util.Objects;
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
        return marca.equals(carro.marca);
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

