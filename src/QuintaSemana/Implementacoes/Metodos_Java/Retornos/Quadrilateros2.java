package QuintaSemana.Implementacoes.Metodos_Java.Retornos;
/*Crie uma aplicação que calcule a área dos quadriláteros notáveis
 * Faça com que os métodos retornem valores; */
public class Quadrilateros2 {

    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
        return lado1 *lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return (baseMaior+baseMenor)*altura / 2;
    }

}
