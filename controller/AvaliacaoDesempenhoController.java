package controller;
import model.AvaliacaoDesempenho;
import model.TipoAvaliacao;
import model.Colaborador;
import java.util.Date;


public class AvaliacaoDesempenhoController {

    private final AvaliacaoDesempenho avaliacao;

    public AvaliacaoDesempenhoController(Date data, Colaborador colaborador, TipoAvaliacao tipo){
        this.avaliacao = new AvaliacaoDesempenho(data, colaborador, tipo);
    }

    public void responderAvaliacao(int[] repostas) {
        avaliacao.setResposta(repostas);
    }

    public void alterarReposta(int[] repostas){
        responderAvaliacao(repostas);
    }

    public void alterarReposta(int reposta, int indice){
        avaliacao.setResposta(reposta, indice);
    }

    public int gerarNota(){
        return avaliacao.gerarNota();
    }

    public void alterarData(Date data){
        avaliacao.setData(data);
    }

}
