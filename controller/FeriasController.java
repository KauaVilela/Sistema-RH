package controller;
import model.Ferias;
import model.Colaborador;
import exceptions.NegocioException;
import java.util.Date;

public class FeriasController {
    private final AprovacaoController aprovacaoController;
    
    public FeriasController(AprovacaoController aprovacaoController) {
        this.aprovacaoController = aprovacaoController;
    }
    
    public Ferias solicitarFerias(Date dtInicio, Date dtFim, 
                                  Colaborador colaborador) 
            throws NegocioException {
        
        long dias = (dtFim.getTime() - dtInicio.getTime()) / (1000 * 60 * 60 * 24);
        
        if (dias < 5 || dias > 30) {
            throw new NegocioException("Férias devem ter entre 5 e 30 dias");
        }
        
        return new Ferias(dtInicio, dtFim, colaborador);
    }
    
    public void iniciarFerias(Ferias ferias) throws NegocioException {
        if (!ferias.isAprovado()) {
            throw new NegocioException("Férias não foram aprovadas");
        }
        ferias.iniciar();
    }
}