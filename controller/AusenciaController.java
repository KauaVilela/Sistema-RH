package controller;
import java.util.Date;
import model.Ausencia;
import model.Colaborador;

public class AusenciaController {
    
    private Ausencia ausencia;

    public AusenciaController() {

    }

    public void justificarAusencia(Date dtInicio, Date dtFim, int tipo, Colaborador colaborador, String justificativa){
        ausencia = new Ausencia(dtInicio, dtFim, tipo, colaborador, false, justificativa);
    }

    public String vizualizarJustificativa(){
        return ausencia.toString();
    }

    public void avaliarJustificativa(boolean avaliacao){
        ausencia.setaprovacao(avaliacao);
    }

}
