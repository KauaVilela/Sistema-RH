package model;
import java.time.Duration;

public class BancoDeHoras {
    
    private Duration bancoHoras;
    private Colaborador colaborador;

    public BancoDeHoras(Colaborador colaborador) {
        this.bancoHoras = Duration.ZERO;
        this.colaborador = colaborador;
    }

    public Duration getBancoHoras() {
        return bancoHoras;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setBancoHoras(int acumularEmMinutos) {
        this.bancoHoras = this.bancoHoras.plusMinutes(acumularEmMinutos);
    }

}
