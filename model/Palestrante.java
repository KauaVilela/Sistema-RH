package model;

public class Palestrante {
    
    private String nome, telefone, formacao, areaDeAtuação, contaBancaria;

    // Construtor

    public Palestrante(String nome, String telefone, String formacao, String areaDeAtuação, String contaBancaria) {
        this.nome = nome;
        this.telefone = telefone;
        this.formacao = formacao;
        this.areaDeAtuação = areaDeAtuação;
        this.contaBancaria = contaBancaria;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaDeAtuação() {
        return areaDeAtuação;
    }

    public void setAreaDeAtuação(String areaDeAtuação) {
        this.areaDeAtuação = areaDeAtuação;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    

}
