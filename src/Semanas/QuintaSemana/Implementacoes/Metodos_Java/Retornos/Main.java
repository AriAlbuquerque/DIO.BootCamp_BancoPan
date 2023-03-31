package Semanas.EqualsHashCode.Metodos_Java.Retornos;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n***********Quadrilateros2**********\n");

       double areaQuadrado = Quadrilateros2.area(3);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaRetangulo = Quadrilateros2.area(5,5);
        System.out.println("A área do retãngulo é: " + areaRetangulo);

        double areaTrapezio = Quadrilateros2.area(7,8,6);
        System.out.println("A área do trapézio é: " + areaTrapezio);
    }
}
