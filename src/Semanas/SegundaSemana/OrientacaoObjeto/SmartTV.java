package SegundaSemana.OrientacaoObjeto;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;

    }

    public void diminuirCanal(){
        canal--;

    }

    public void aumentarVolume(){
        volume++;//Incrementação
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;//decremento
        System.out.println("Diminuindo volume para: " + volume);

    }

    public void ligar(){//Método ligar.
        ligada=true;
    }
    public void desligar(){//Método desligar;
        ligada=false;

    }
}


