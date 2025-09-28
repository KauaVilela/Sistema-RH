package controller;

import model.BancoDeHoras;
import model.Colaborador;

public class BancoDeHorasController {
    
    private BancoDeHoras banco;

    public BancoDeHorasController(Colaborador colaborador){
        banco = new BancoDeHoras(colaborador);
    }

    public void atualizarBanco(int minutos){
        banco.setBancoHoras(minutos);
    }

}
