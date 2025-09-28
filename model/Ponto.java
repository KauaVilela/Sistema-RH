package model;
import java.time.LocalDateTime;

public class Ponto {
    
    private LocalDateTime marcacao;
    private String relogio;
    private Colaborador colaborador;

    // Construtor

    public Ponto(LocalDateTime marcacao, String relogio, Colaborador colaborador) {
        this.marcacao = marcacao;
        this.relogio = relogio;
        this.colaborador = colaborador;
    }

    // Getters and Setters

    public LocalDateTime getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(LocalDateTime marcacao) {
        this.marcacao = marcacao;
    }

    public String getRelogio() {
        return relogio;
    }

    public void setRelogio(String relogio) {
        this.relogio = relogio;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

}
