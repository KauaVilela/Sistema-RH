package model;
import java.time.LocalDateTime;

public class AjustePonto {
    
    private Ponto ponto;
    private LocalDateTime ajustePonto;
    private boolean aprovacao;
    private String justificativa;

    // Construtor
    
    public AjustePonto(Ponto ponto, LocalDateTime ajustePonto, String justificativa) {
        this.ponto = ponto;
        this.ajustePonto = ajustePonto;
        this.justificativa = justificativa;
    }

    // Getters and Setters

    public Ponto getPonto() {
        return ponto;
    }
    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
    public LocalDateTime getAjustePonto() {
        return ajustePonto;
    }
    public void setAjustePonto(LocalDateTime ajustePonto) {
        this.ajustePonto = ajustePonto;
    }
    public boolean isAprovacao() {
        return aprovacao;
    }
    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

}
