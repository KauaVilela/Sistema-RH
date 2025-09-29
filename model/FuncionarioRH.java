package model;
public class FuncionarioRH extends Usuario {

     private String areaAtuacao;
    
    public FuncionarioRH() {
        super();
    }
    
    public FuncionarioRH(String login, String senha, int nivelAcesso, String areaAtuacao) {
        super(login, senha, nivelAcesso);
        this.areaAtuacao = areaAtuacao;
    }
    
    public String getAreaAtuacao() { return areaAtuacao; }
    public void setAreaAtuacao(String areaAtuacao) { this.areaAtuacao = areaAtuacao; }
    
    public String toString() {
        return "FuncionarioRH{" +
                "login='" + getLogin() + '\'' +
                ", nivelAcesso=" + getNivelAcesso() +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }



}