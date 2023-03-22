package Desafios_DIO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class MediaTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>(); //Criando Interface ArrayList;

        int count = 0;                        //Iniciando contador;
        while (true) {
            if (count == 6)
                break;

            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);             //Add elemento de entrada via scan na variável temp;
            count++;
        }
        System.out.println(" \n");

        System.out.println("Temperaturas informadas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));   //criando a variável que vai receber os valores da estrutura que você vai percorrer com forEach;

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperatutas dos primeiros seis meses: %.1f\n", media);

        System.out.println("Temperaturas que ficaram acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f", t, "º"));

        System.out.println("\nMeses com temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1- Janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2- Fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3- Março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4- Abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5- Maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6- Junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
