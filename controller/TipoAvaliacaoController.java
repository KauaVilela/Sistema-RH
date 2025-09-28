package controller;

import model.TipoAvaliacao;

public class TipoAvaliacaoController {
    
    private final TipoAvaliacao tipo;

    public TipoAvaliacaoController(String nome, String descricao, String[] pergunta){
       this.tipo = new TipoAvaliacao(nome, descricao, pergunta);
    }

    public void alterarPergunta(String pergunta, int indice){
        tipo.setPergunta(pergunta, indice);
    }

    public void alterarPergunta(String[] pergunta){
        tipo.setPergunta(pergunta);
    }

}
