package controller;

import interfaces.IAprovavel;
import strategies.IEstrategiaAprovacao;
import exceptions.NegocioException;

public class AprovacaoController {
    private final IEstrategiaAprovacao estrategia;
    
    public AprovacaoController(IEstrategiaAprovacao estrategia) {
        this.estrategia = estrategia;
    }
    
    public void aprovar(IAprovavel item) throws NegocioException {
        if (!estrategia.podeAprovar(item)) {
            throw new NegocioException("Não é possível aprovar este item");
        }
        estrategia.executarAprovacao(item);
    }
    
    public void reprovar(IAprovavel item, String motivo) throws NegocioException {
        if (motivo == null || motivo.trim().isEmpty()) {
            throw new NegocioException("Motivo da reprovação é obrigatório");
        }
        estrategia.executarReprovacao(item, motivo);
    }
}
