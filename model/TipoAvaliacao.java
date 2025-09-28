package model;

public class TipoAvaliacao {
    
    private String nome, descricao;
    private String[] pergunta;

    // Construtor

    public TipoAvaliacao(String nome, String descricao, String[] pergunta){
        this.nome = nome;
        this.descricao = descricao;
        this.pergunta = pergunta;
    }

    public int quantidadePerguntas() {
        return pergunta.length;
    }

    // Getter and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String[] getPergunta() {
        return pergunta;
    }

    public String getPergunta(int indice) {
        return pergunta[indice];
    }

    public void setPergunta(String pergunta, int indice) {
        this.pergunta[indice] = pergunta;
    }

    public void setPergunta(String[] pergunta) {
        this.pergunta = pergunta;
    }

}
