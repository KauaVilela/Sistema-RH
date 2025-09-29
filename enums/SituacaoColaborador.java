package enums;

public enum SituacaoColaborador {
    ATIVO(1),
    INATIVO(0),
    FERIAS(2),
    AFASTADO(3);
    
    private final int codigo;
    
    SituacaoColaborador(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
}
