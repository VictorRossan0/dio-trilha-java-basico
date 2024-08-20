public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();//24
        smartTV.diminuirVolume();//23
        smartTV.diminuirVolume();//22
        smartTV.aumentarVolume();//23

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual : " +smartTV.canal);

        System.out.println("TV Ligada ? " +smartTV.ligada);
        smartTV.aumentarCanal();
        System.out.println("Canal Atual : " +smartTV.canal);
        System.out.println("Volume Atual : " +smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada ? " +smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada ? " +smartTV.ligada);

    }
}
