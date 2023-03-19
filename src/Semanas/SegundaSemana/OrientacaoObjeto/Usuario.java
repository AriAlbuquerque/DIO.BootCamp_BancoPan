package SegundaSemana.OrientacaoObjeto;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();


        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        System.out.println("Tv Ligada: " + smartTV.ligada);
        System.out.println("Canal Atual: "+ smartTV.canal);
        System.out.println("Volume atual: "+smartTV.volume);
        System.out.println("Volume atual: " + smartTV.volume);


        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}

