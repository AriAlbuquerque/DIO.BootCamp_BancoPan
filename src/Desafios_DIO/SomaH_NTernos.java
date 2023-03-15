package Desafios_DIO;
import java.util.Scanner;
public class SomaH_NTernos {

    public void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número par e positivo:");
        double n = sc.nextDouble();

        int i;
        for (i = 1; i <= n; i++) {

        }
        //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

        h = h + (double) 1 / i;

        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        System.out.println((int) h);

    }
}
