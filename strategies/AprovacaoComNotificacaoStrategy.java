package strategies;

import interfaces.IAprovavel;
import interfaces.INotificador;

public class AprovacaoComNotificacaoStrategy implements IEstrategiaAprovacao {
    private final INotificador notificador;
    
    public AprovacaoComNotificacaoStrategy(INotificador notificador) {
        this.notificador = notificador;
    }
    
    @Override
    public boolean podeAprovar(IAprovavel item) {
        return true;
    }
    
    @Override
    public void executarAprovacao(IAprovavel item) {
        item.aprovar();
        notificador.enviarNotificacao("usuario@email.com", 
            "Sua solicitação foi aprovada!");
    }
    
    @Override
    public void executarReprovacao(IAprovavel item, String motivo) {
        item.reprovar(motivo);
        notificador.enviarNotificacao("usuario@email.com", 
            "Sua solicitação foi reprovada: " + motivo);
    }
}
