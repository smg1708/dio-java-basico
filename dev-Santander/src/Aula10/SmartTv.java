package Aula10;
public class SmartTv {
    boolean ligada=false;
    boolean desligada=true;
    int canal= 1;
    int volume = 25;
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void dimunuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: "  +volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        desligada=false;
    }
}


