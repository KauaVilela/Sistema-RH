package controller;
import java.time.LocalDateTime;

import model.AjustePonto;
import model.Colaborador;
import model.Ponto;

public class PontoController {
    
    private Ponto ponto;
    private AjustePonto ajuste;

    public PontoController(LocalDateTime marcacao, String relogio, Colaborador colaborador){
        ponto = new Ponto(marcacao, relogio, colaborador);
    }

    public void SolicitarAjuste(LocalDateTime ajustePonto, String justificativa){
        ajuste = new AjustePonto(ponto, ajustePonto, justificativa);
    }

    public void avaliarSolicitação(boolean avaliacao){
        
        ajuste.setAprovacao(avaliacao);

        if (avaliacao){
            ponto.setMarcacao(ajuste.getAjustePonto());
        }
    }


}
