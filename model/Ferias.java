package model;
import interfaces.IAprovavel;
import java.util.Date;

public class Ferias implements IAprovavel {
    private Date dtInicio;
    private Date dtFim;
    private String status;
    private Colaborador colaborador;
    private String motivoReprovacao;
    
    public Ferias(Date dtInicio, Date dtFim, Colaborador colaborador) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.colaborador = colaborador;
        this.status = "SOLICITADO";
    }
    
    @Override
    public boolean isAprovado() {
        return "APROVADO".equals(status);
    }
    
    @Override
    public void aprovar() {
        this.status = "APROVADO";
    }
    
    @Override
    public void reprovar(String motivo) {
        this.status = "REPROVADO";
        this.motivoReprovacao = motivo;
    }
    
    @Override
    public String getStatus() {
        return status;
    }
    
    public void iniciar() {
        if (isAprovado()) {
            this.status = "EM_CURSO";
        }
    }
    
    // Getters
    public Date getDtInicio() { return dtInicio; }
    public Date getDtFim() { return dtFim; }
    public Colaborador getColaborador() { return colaborador; }
    public String getMotivoReprovacao() { return motivoReprovacao; }
}
