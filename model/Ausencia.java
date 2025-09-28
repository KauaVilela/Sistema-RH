package model;
import java.util.Date;

public class Ausencia {
    
    private Date dtInicio, dtFim;
    private int tipo;
    private Colaborador colaborador;
    private boolean aprovacao;
    private String justificativa;

    // Construtor

    public Ausencia(Date dtInicio, Date dtFim, int tipo, Colaborador colaborador, boolean aprovacao, String justificativa) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.tipo = tipo;
        this.colaborador = colaborador;
        this.justificativa = justificativa;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public boolean isaprovacao() {
        return aprovacao;
    }

    public void setaprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    @Override
    public String toString() {
        return "Ausencia [dtInicio=" + dtInicio + ", dtFim=" + dtFim + ", tipo=" + tipo + ", colaborador=" + colaborador
                + ", aprovacao=" + aprovacao + ", justificativa=" + justificativa + "]";
    }

}
