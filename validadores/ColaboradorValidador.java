package validadores;

import interfaces.IValidador;
import model.Colaborador;

public class ColaboradorValidador implements IValidador<Colaborador> {
    private String mensagemErro;
    
    @Override
    public boolean validar(Colaborador colaborador) {
        if (colaborador.getNome() == null || colaborador.getNome().trim().isEmpty()) {
            mensagemErro = "Nome não pode ser vazio";
            return false;
        }
        
        if (colaborador.getCpf() == null || !validarCPF(colaborador.getCpf())) {
            mensagemErro = "CPF inválido";
            return false;
        }
        
        if (colaborador.getSalario() <= 0) {
            mensagemErro = "Salário deve ser maior que zero";
            return false;
        }
        
        return true;
    }
    
    private boolean validarCPF(String cpf) {
        // Implementação simplificada
        return cpf != null && cpf.matches("\\d{11}");
    }
    
    @Override
    public String obterMensagemErro() {
        return mensagemErro;
    }
}
