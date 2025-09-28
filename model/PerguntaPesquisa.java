package model;
public class PerguntaPesquisa {

    private String pergunta;
    private String[] respostaPadrao ;

    // Construtores

    public PerguntaPesquisa() {

    }

    public PerguntaPesquisa(String pergunta, String[] respostaPadrao){
        this.pergunta = pergunta;
        this.respostaPadrao = respostaPadrao;
    }

    // Getters and Setter

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getRespostaPadrao() {
        return respostaPadrao;
    }

    public void setRespostaPadrao(String respostaPadrao[]) {
        this.respostaPadrao = respostaPadrao;
    }

    

}