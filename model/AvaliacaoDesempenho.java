package model;
import java.util.Date;

public class AvaliacaoDesempenho {

    private Date data;
    private Colaborador colaboradorAvaliado;
    private TipoAvaliacao tipo;
    private int[] resposta;

    // Construtor

    public AvaliacaoDesempenho(Date data, Colaborador colaboradorAvaliado){
        this.data = data;
        this.colaboradorAvaliado = colaboradorAvaliado;
    }

    public AvaliacaoDesempenho(Date data, Colaborador colaboradorAvaliado, TipoAvaliacao tipo){
        this.data = data;
        this.colaboradorAvaliado = colaboradorAvaliado;
        this.tipo = tipo;
    }

    // Métodos

    public int gerarNota(){
        int media = 0;

        for (int ind = 0; ind < resposta.length; ind++){
            media = media + resposta[ind];
        }

        return media / resposta.length;
    }

    // Getters and Setters

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Colaborador getColaboradorAvaliado() {
        return colaboradorAvaliado;
    }

    public void setColaboradorAvaliado(Colaborador colaboradorAvaliado) {
        this.colaboradorAvaliado = colaboradorAvaliado;
    }

    public TipoAvaliacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoAvaliacao tipo) {
        this.tipo = tipo;
    }

    public int[] getResposta() {
        return resposta;
    }

    public int getResposta(int indice) {
        return resposta[indice];
    }

    public void setResposta(int[] resposta) {
        this.resposta = resposta;
    }

    public void setResposta(int resposta, int indice) {
        this.resposta[indice] = resposta;
    }



}