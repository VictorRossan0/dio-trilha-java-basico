public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // Pode ser "B", "M", ou "T"

        // Usando switch-case para verificar o plano
        switch (plano) {
            case "T":
                // Caso seja plano "T", inclui as opções abaixo, além das opções dos planos anteriores.
                System.out.println("5Gb Youtube");
                // Não há break aqui, então ele continua para o próximo caso ("M").
            case "M":
                // Caso seja plano "M" ou "T", inclui as opções abaixo, além das opções do plano "B".
                System.out.println("WhatsApp e Instagram grátis");
                // Não há break aqui, então ele continua para o próximo caso ("B").
            case "B":
                // Caso seja plano "B", "M" ou "T", inclui os 100 minutos de ligação.
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano inválido");
                break;
        }
    }
}
