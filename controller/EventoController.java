package controller;
import java.util.Date;

import model.Evento;

public class EventoController {
    
    private Evento evento;

    public EventoController(){

    }

    public void agendarEvento(Date data, String tema, String descricao, String status, String justificativa, double investimento){
        evento = new Evento(data, tema, descricao, status, justificativa, investimento);
    }

    public String verificarStatus(){
        return evento.getStatus();
    }

    public void cancelarEvento(){
        evento.setStatus("Cancelado");
    }


}
