package model;
public class Lider extends Usuario {
    
    private String nivelLideranca;
    private String setorResponsavel;
    
    public Lider() {
        super();
    }
    
    public Lider(String login, String senha, int nivelAcesso, 
                 String nivelLideranca, String setorResponsavel) {
        super(login, senha, nivelAcesso);
        this.nivelLideranca = nivelLideranca;
        this.setorResponsavel = setorResponsavel;
    }
    
    public void alterarSetorResponsavel(String novoSetor) {
        this.setorResponsavel = novoSetor;
        System.out.println("Setor responsável alterado para: " + novoSetor);
    }
    
    public void alterarNivel(String novoNivelLideranca) {
        this.nivelLideranca = novoNivelLideranca;
        System.out.println("Nível de liderança alterado para: " + novoNivelLideranca);
    }
    
    public String getNivelLideranca() { return nivelLideranca; }
    public void setNivelLideranca(String nivelLideranca) { this.nivelLideranca = nivelLideranca; }
    
    public String getSetorResponsavel() { return setorResponsavel; }
    public void setSetorResponsavel(String setorResponsavel) { this.setorResponsavel = setorResponsavel; }
    
    public String toString() {
        return "Lider{" +
                "login='" + getLogin() + '\'' +
                ", nivelAcesso=" + getNivelAcesso() +
                ", nivelLideranca='" + nivelLideranca + '\'' +
                ", setorResponsavel='" + setorResponsavel + '\'' +
                '}';
    }
     
}
