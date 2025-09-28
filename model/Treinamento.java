package model;
import java.util.Date;

public class Treinamento {
    
    private Date dtInicio, dtFim;
    private String tema, status;
    private Palestrante[] palestrante;
    
    // Construtor

    public Treinamento(Date dtInicio, Date dtFim, String tema) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tema = tema;
    }

    public Treinamento(Date dtInicio, Date dtFim, String tema, Palestrante[] palestrante) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tema = tema;
        this.palestrante = palestrante;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Palestrante[] getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante[] palestrante) {
        this.palestrante = palestrante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
    

}
