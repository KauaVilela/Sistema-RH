package strategies;

import interfaces.IAprovavel;

public interface IEstrategiaAprovacao {
    boolean podeAprovar(IAprovavel item);
    void executarAprovacao(IAprovavel item);
    void executarReprovacao(IAprovavel item, String motivo);
}
