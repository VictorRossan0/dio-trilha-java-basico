package Exemplo_Interface.Estabelecimento;

import Exemplo_Interface.Equipamentos.Copiadora.Copiadora;
import Exemplo_Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Exemplo_Interface.Equipamentos.Digitalizadora.Scanner;
import Exemplo_Interface.Equipamentos.Impressora.Deskjet;
import Exemplo_Interface.Equipamentos.Impressora.Impressora;
import Exemplo_Interface.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
