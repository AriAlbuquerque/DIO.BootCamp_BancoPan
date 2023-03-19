package Desafios_DIO;

import java.util.Scanner;

public class SomaHcomNTermos {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        double h = 0;
        double n = sc.nextDouble();


        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (double) 1/i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        System.out.printf("%.0f",h);
    }
}
