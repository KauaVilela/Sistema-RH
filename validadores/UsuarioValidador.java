package validadores;

import interfaces.IValidador;
import model.Usuario;

public class UsuarioValidador implements IValidador<Usuario> {
    private String mensagemErro;
    
    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.getLogin() == null || usuario.getLogin().trim().isEmpty()) {
            mensagemErro = "Login não pode ser vazio";
            return false;
        }
        
        if (usuario.getSenha() == null || usuario.getSenha().length() < 6) {
            mensagemErro = "Senha deve ter no mínimo 6 caracteres";
            return false;
        }
        
        if (usuario.getNivelAcesso() < 0) {
            mensagemErro = "Nível de acesso inválido";
            return false;
        }
        
        return true;
    }
    
    @Override
    public String obterMensagemErro() {
        return mensagemErro;
    }
}
