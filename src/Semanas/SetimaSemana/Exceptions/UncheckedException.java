package Semanas.SetimaSemana.Exceptions;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!" + e.getMessage());
               // e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossível dividir um número por 0.");
                // e.printStackTrace();
            }
            finally {
                System.out.println("Chegou ao finally!");
            }

        } while (continueLooping);

        System.out.println("O bloco de código continua...");
    }
    public static double dividir(double a, double b){
        return a / b;
    }
}
