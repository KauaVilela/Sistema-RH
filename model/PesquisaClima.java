package model;
import java.util.Date;

public class PesquisaClima {
    
    private Date dtInicio, dtFim;
    private int qtdPerguntas, qtdPerguntasAtual = 0;
    private PerguntaPesquisa[] perguntas;

    // Construtores

    public PesquisaClima(){

    }

    public PesquisaClima(Date dtInicio, Date dtFim, int qtdPerguntas) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.qtdPerguntas = qtdPerguntas;
        perguntas = new PerguntaPesquisa[this.qtdPerguntas];
    }

    // Métodos

    public String incluirPergunta(PerguntaPesquisa pergunta){
        if (qtdPerguntasAtual == qtdPerguntas){
            return "Já foi inserido o total de perguntas programado.";
        }
        else{
            perguntas[qtdPerguntasAtual] = pergunta;
            qtdPerguntasAtual++;
            return "Pergunta Inserida";
        }
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

    public int getQtdPerguntas() {
        return qtdPerguntas;
    }

    public void setQtdPerguntas(int qtdPerguntas) {
        this.qtdPerguntas = qtdPerguntas;
        perguntas = new PerguntaPesquisa[this.qtdPerguntas];
    }

}



