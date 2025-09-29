package model;
public class Usuario {
     private String login;
    private String senha;
    private int nivelAcesso;
    
    public Usuario() {}
    
    public Usuario(String login, String senha, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    public boolean alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
            return true;
        } else {
            System.out.println("Senha atual incorreta!");
            return false;
        }
    }
    
    public boolean cadastrarUsuario() {
        if (this.login != null && !this.login.trim().isEmpty() && 
            this.senha != null && !this.senha.trim().isEmpty()) {
            System.out.println("Usuário " + this.login + " cadastrado com sucesso!");
            return true;
        } else {
            System.out.println("Erro ao cadastrar usuário: dados inválidos!");
            return false;
        }
    }
    
    public void alterarCredenciais(String novoLogin, String novaSenha) {
        if (novoLogin != null && !novoLogin.trim().isEmpty()) {
            this.login = novoLogin;
        }
        if (novaSenha != null && !novaSenha.trim().isEmpty()) {
            this.senha = novaSenha;
        }
        System.out.println("Credenciais atualizadas para o usuário: " + this.login);
    }
    
    public void atualizarNivel(int novoNivel) {
        this.nivelAcesso = novoNivel;
        System.out.println("Nível de acesso atualizado para: " + novoNivel);
    }
    
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    
    public int getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(int nivelAcesso) { this.nivelAcesso = nivelAcesso; }
    
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", nivelAcesso=" + nivelAcesso +
                '}';
    }
    
}
