package controller;
import java.util.Date;

import model.Palestrante;
import model.Treinamento;

public class TreinamentoController {
    
    private Treinamento treinamento;

    public TreinamentoController(){

    }

    public void agendarTreinamento(Date dtIncio, Date dtFim, String tema){
        treinamento = new Treinamento(dtIncio, dtFim, tema);
    }

    public void vincularPalestrante(Palestrante[] palestrante){
        treinamento.setPalestrante(palestrante);
    }

    public void alterarStatus(String status){
        treinamento.setStatus(status);
    }

}
