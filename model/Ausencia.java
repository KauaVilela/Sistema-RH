package model;
import interfaces.IAprovavel;
import java.util.Date;

public class Ausencia implements IAprovavel {
    private Date dtInicio;
    private Date dtFim;
    private int tipo;
    private Colaborador colaborador;
    private String status;
    private String justificativa;
    private String motivoReprovacao;
    
    public Ausencia(Date dtInicio, Date dtFim, int tipo, 
                    Colaborador colaborador, String justificativa) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tipo = tipo;
        this.colaborador = colaborador;
        this.justificativa = justificativa;
        this.status = "PENDENTE";
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
    
    // Getters e Setters
    public Date getDtInicio() { return dtInicio; }
    public Date getDtFim() { return dtFim; }
    public int getTipo() { return tipo; }
    public Colaborador getColaborador() { return colaborador; }
    public String getJustificativa() { return justificativa; }
    public String getMotivoReprovacao() { return motivoReprovacao; }
}