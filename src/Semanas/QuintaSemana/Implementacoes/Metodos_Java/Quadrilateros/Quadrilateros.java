package QuintaSemana.Implementacoes.Metodos_Java.Quadrilateros;

public class Quadrilateros {

    public static double area(double lado) {
        System.out.println("A área do quadrado: " + lado * lado);
        return lado;
    }
    public static void area(double lado1, double lado2) {
        System.out.println("A área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio: " + ((baseMenor + baseMaior) * altura) / 2);
    }
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A área do losango: " + (diagonal1 + diagonal2) / 2);
    }
}
