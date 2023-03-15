package Desafios_DIO;

import java.util.Scanner;

public class PositivoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        double sumPositive = 0;

        for (int i = 1; i <= 6; i++) {
            double number = scanner.nextDouble();

            if (number > 0) {
                countPositive++;
                sumPositive += number;
            }
        }

        System.out.println(countPositive + " -> Valores positivos.");

        if (countPositive > 0) {
            double average = sumPositive / countPositive;
            System.out.printf("%.1f", average);
        }
    }
}