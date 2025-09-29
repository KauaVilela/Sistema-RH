package interfaces;

public interface IValidador<T> {
    boolean validar(T entidade);
    String obterMensagemErro();
}
