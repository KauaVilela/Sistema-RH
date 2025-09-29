package strategies;

import interfaces.IAprovavel;

public class AprovacaoAutomaticaStrategy implements IEstrategiaAprovacao {
    
    @Override
    public boolean podeAprovar(IAprovavel item) {
        return true; // Sempre pode aprovar
    }
    
    @Override
    public void executarAprovacao(IAprovavel item) {
        item.aprovar();
        System.out.println("Aprovação automática realizada");
    }
    
    @Override
    public void executarReprovacao(IAprovavel item, String motivo) {
        item.reprovar(motivo);
        System.out.println("Reprovação: " + motivo);
    }
}
