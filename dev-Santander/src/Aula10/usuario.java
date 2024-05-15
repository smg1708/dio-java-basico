package Aula10;

public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv= new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(15);
        System.out.println("Volume Atual ? " + smartTv.volume);
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);
        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);
        smartTv.desligar ();
        System.out.println("Novo Status -> TV Desligada: " + smartTv.desligada);
    }
}
