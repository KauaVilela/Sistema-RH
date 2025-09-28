package controller;

import model.Palestrante;

public class PalestranteController {
 
    private Palestrante novoPalestrante;

    public PalestranteController(){

    }

    public void cadastrarPalestrante(String nome, String telefone, String formacao, String areaDeAtuação, String contaBancaria){
        novoPalestrante = new Palestrante(nome, telefone, formacao, areaDeAtuação, contaBancaria);
    }


}
