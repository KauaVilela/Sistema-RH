package model;
import java.util.Date;

public class Ferias {
 
    private Date dtInicio, dtFim;
    private String status;
    private Colaborador colaborador;

    // Construtor

    public Ferias(Date dtInicio, Date dtFim, String status, Colaborador colaborador) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.status = status;
        this.colaborador = colaborador;
    }

    // Getters and Setters

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    

}
