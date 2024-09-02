package Exemplo_Polimorfismo;

import Exemplo_Polimorfismo.apps.FacebookMessenger;
import Exemplo_Polimorfismo.apps.MSNMessenger;
import Exemplo_Polimorfismo.apps.ServicoMensagemInstantanea;
import Exemplo_Polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido="msn";
        
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        }
        else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
