public class SmartTV {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        // volume = volume + 1;
    }

    public void diminuirVolume(){
        // volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o volume para: " + volume);
        // volume = volume + 1;
    }

    public void diminuirCanal(){
        // volume = volume - 1;
        canal--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
