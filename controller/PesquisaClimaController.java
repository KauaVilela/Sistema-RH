package controller;
import java.util.Date;
import model.PerguntaPesquisa;
import model.PesquisaClima;

public class PesquisaClimaController {
    
    private final PesquisaClima pesquisa;
    private PerguntaPesquisa perguntaDaPesquisa;

    public PesquisaClimaController() {
        pesquisa = new PesquisaClima();
    }

    public void agendarPesquisa(Date dtInicio, Date dtFim) {
        pesquisa.setDtInicio(dtInicio);
        pesquisa.setDtFim(dtFim);
    }

    public void setQuantidadePerguntas(int qtdPerguntas){
        pesquisa.setQtdPerguntas(qtdPerguntas);
    }


    public String associarPergunta(String pergunta, String[] repostas){
        perguntaDaPesquisa = new PerguntaPesquisa(pergunta, repostas);
        return pesquisa.incluirPergunta(perguntaDaPesquisa);
    }
}
