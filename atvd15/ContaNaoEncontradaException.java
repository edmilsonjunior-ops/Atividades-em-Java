package atvd15;

public class ContaNaoEncontradaException extends RuntimeException {

    public ContaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}