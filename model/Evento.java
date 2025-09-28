package model;
import java.util.Date;

public class Evento {
    
    private Date data;
    private String tema, descricao, status, justificativa;
    private double investimento;

    // Construtor
    
    public Evento(Date data, String tema, String descricao, String status, String justificativa, double investimento) {
        this.data = data;
        this.tema = tema;
        this.descricao = descricao;
        this.status = status;
        this.justificativa = justificativa;
        this.investimento = investimento;
    }

    // Getters and Setters

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    

}
