package controller;
import model.Ferias;
import model.Colaborador;
import java.util.Date;

public class FeriasController {
    
    private Ferias ferias;

    public FeriasController(){

    }

    public void solicitarFerias(Date dtInicio, Date dtFim, Colaborador colaborador){
        ferias = new Ferias(dtInicio, dtFim, "Solicitado", colaborador);
    }

    public void avaliarSolicitacao(String retorno){
        ferias.setStatus(retorno);
    }

    public void gozarFerias(){
        ferias.setStatus("Em curso");
    }

}
