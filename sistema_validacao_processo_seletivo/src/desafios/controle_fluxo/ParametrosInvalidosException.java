package desafios.controle_fluxo;

// Exceção customizada que será lançada quando os parâmetros forem inválidos
public class ParametrosInvalidosException extends Exception {
    // Construtor padrão da exceção
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

