package Exemplo_Interface.Equipamentos.Multifuncional;

import Exemplo_Interface.Equipamentos.Copiadora.Copiadora;
import Exemplo_Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Exemplo_Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{
    public void copiar(){
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
