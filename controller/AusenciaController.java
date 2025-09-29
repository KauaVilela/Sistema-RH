package controller;
import model.Ausencia;
import model.Colaborador;
import enums.TipoAusencia;
import services.ColaboradorService;
import exceptions.ValidacaoException;
import java.util.Date;

public class AusenciaController {
    private final ColaboradorService colaboradorService;
    private final AprovacaoController aprovacaoController;
    
    public AusenciaController(ColaboradorService colaboradorService,
                             AprovacaoController aprovacaoController) {
        this.colaboradorService = colaboradorService;
        this.aprovacaoController = aprovacaoController;
    }
    
    public Ausencia justificarAusencia(Date dtInicio, Date dtFim, 
                                       TipoAusencia tipo, 
                                       Colaborador colaborador, 
                                       String justificativa) 
            throws ValidacaoException {
        
        if (justificativa == null || justificativa.trim().isEmpty()) {
            throw new ValidacaoException("Justificativa é obrigatória");
        }
        
        return new Ausencia(dtInicio, dtFim, tipo.getCodigo(), 
                           colaborador, justificativa);
    }
}
