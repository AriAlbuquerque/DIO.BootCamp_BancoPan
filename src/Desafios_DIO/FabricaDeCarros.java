package Desafios_DIO;

import java.util.Scanner;

public class FabricaDeCarros {
           public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com o valor de fabrica: ");
            int custoFabrica = scan.nextInt();

            System.out.println("Entre com o valor da porcentagem do Distribuidor: ");
            int porcentagemDistribuidor = scan.nextInt();

            System.out.println("Entre com o valor dos impostos: ");
            int PercentualImpostos = scan.nextInt();

            int custoConsumidor;
            int Distribuidor;
            int ValorImpostos ;

            Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
            custoConsumidor = Distribuidor + ValorImpostos;
            System.out.println(custoConsumidor+custoFabrica);

        }
    }

