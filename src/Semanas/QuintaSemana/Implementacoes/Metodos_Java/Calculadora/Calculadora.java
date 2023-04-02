package Semanas.QuintaSemana.Implementacoes.Metodos_Java.Calculadora;
/*
 * Criar aplicação que resolva as seguintes sutuações:
 * Calcular as quatro operaões básicas(SOMA, SUBTRAÇÃO, DIVISÃO E MULTIPLICAÇÃO)
 */
public class Calculadora {

    public static void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma de: " + num1 + " + " + num2 + " = " + resultado);
    }
    public static void subtracao(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("A subtracao de: " + num1 + " - " + num2 + " = " + resultado);

    }
public static void divisao(double num1, double num2){
        double resultado = num1 / num2;
    System.out.println("A divisão de: " + num1 + " % " + num2 + " = " + resultado);

}
public static void multiplicacao(double num1, double num2){
        double resultado = num1 * num2;
    System.out.println("A multiplicação de: " + num1 + " x " + num2 + " = " + resultado);

}

}
