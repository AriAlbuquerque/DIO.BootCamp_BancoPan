package Semanas.EqualsHashCode.equalsHashCode;

public class Resumo {

    /**


    * Comando equals() realiza comparações de igualdade entre Objetos:

    @Override
    //public boolean equals(Object o) {
     }

    *Comando hashCode() percorre a lista e retorna a informação:

    @Override
      public int hashCode(){
        }


   ************* Carro Carro ***************

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
    public boolean equals(Object o) {           // Método equals;
        if (this == o) return true;            // Testa se (Objeto o) que foi instanciado é igual a elemento de entrada;
        if (o == null || getClass() != o.getClass()) return false;  //Testa se o Objeto é null OU se a Carro dos Objetos são diferentes se sim retorna false;
        Carro carro = (Carro) o;      //Casting criando objeto carro temporario para testar usando atributo marca;;
        return marca.equals(carro.marca);  //Retorno com equals;
    }
    @Override
    public int hashCode() {    0
        return Objects.hash(marca);
    }
}
***********************************************************************************

             ******* Carro SomaHcomNTermos *********

package Semanas.Implementacoes.equalsHashCode;
import java.util.List;
import java.util.ArrayList;

public class SomaHcomNTermos {

    public static void SomaHcomNTermos(String[] args) {

        List<Carro> listaCarros = new ArrayList<>(); //Criando novo objeto um ArrayList;

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros);

        System.out.println(listaCarros.contains(new Carro("Ford")));     //Comparando por igualdade atráves da marca utilizando equals e hashCode;
        System.out.println(new Carro("Ford").hashCode());         //Retorna a posição do elemento na lista;
        System.out.println(new Carro("Chevrolet").hashCode());
        System.out.println(new Carro("Volkswagen").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
        System.out.println(listaCarros);
        listaCarros.add(new Carro("Volkswagen"));
        System.out.println(listaCarros);


    }
}
 ******************************************************************
 * */

    
}
