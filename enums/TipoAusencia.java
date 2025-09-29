package enums;

public enum TipoAusencia {
    ATESTADO_MEDICO(1),
    LICENCA_MATERNIDADE(2),
    LICENCA_PATERNIDADE(3),
    FALTA_JUSTIFICADA(4),
    FALTA_INJUSTIFICADA(5);
    
    private final int codigo;
    
    TipoAusencia(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
}
