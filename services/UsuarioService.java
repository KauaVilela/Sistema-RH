package services;

import interfaces.IValidador;
import model.Usuario;
import exceptions.ValidacaoException;
import exceptions.NegocioException;

public class UsuarioService {
    private final IValidador<Usuario> validador;
    
    public UsuarioService(IValidador<Usuario> validador) {
        this.validador = validador;
    }
    
    public void cadastrar(Usuario usuario) throws ValidacaoException {
        if (!validador.validar(usuario)) {
            throw new ValidacaoException(validador.obterMensagemErro());
        }
        // Lógica de cadastro
        System.out.println("Usuário " + usuario.getLogin() + " cadastrado com sucesso!");
    }
    
    public void alterarSenha(Usuario usuario, String senhaAtual, String novaSenha) 
            throws NegocioException {
        if (!usuario.getSenha().equals(senhaAtual)) {
            throw new NegocioException("Senha atual incorreta!");
        }
        
        if (novaSenha.length() < 6) {
            throw new NegocioException("Nova senha deve ter no mínimo 6 caracteres");
        }
        
        usuario.setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso!");
    }
}
