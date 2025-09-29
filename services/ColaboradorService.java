package services;

import interfaces.IValidador;
import model.Colaborador;
import enums.SituacaoColaborador;
import exceptions.ValidacaoException;
import exceptions.NegocioException;

public class ColaboradorService {
    private final IValidador<Colaborador> validador;
    
    public ColaboradorService(IValidador<Colaborador> validador) {
        this.validador = validador;
    }
    
    public void cadastrar(Colaborador colaborador) throws ValidacaoException {
        if (!validador.validar(colaborador)) {
            throw new ValidacaoException(validador.obterMensagemErro());
        }
        colaborador.setSituacao(SituacaoColaborador.ATIVO.getCodigo());
        System.out.println("Colaborador " + colaborador.getNome() + " cadastrado!");
    }
    
    public void demitir(Colaborador colaborador) throws NegocioException {
        if (colaborador.getSituacao() == SituacaoColaborador.INATIVO.getCodigo()) {
            throw new NegocioException("Colaborador já está inativo");
        }
        colaborador.setSituacao(SituacaoColaborador.INATIVO.getCodigo());
        System.out.println("Colaborador " + colaborador.getNome() + " foi demitido.");
    }
    
    public void alterarSalario(Colaborador colaborador, double novoSalario) 
            throws NegocioException {
        if (novoSalario <= 0) {
            throw new NegocioException("Salário deve ser maior que zero");
        }
        colaborador.setSalario(novoSalario);
        System.out.println("Salário alterado para: R$ " + novoSalario);
    }
}
