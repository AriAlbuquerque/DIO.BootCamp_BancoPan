package Desafios_DIO;
import java.util.Scanner;
public class SomaH_NTernos {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;


                for (int i = 1; i <= n; i++) {
                    //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
                    h += (1 + n) / i;

                }
                //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:

        System.out.printf(String.valueOf(h));
            }
        }