package com.fernanda.modulo3semana2.rest.dto;

public class AtendimentosDto {
    private String profissional;
    private String categoria;
    private String descricao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString(){
        return "AtendimentosDto{" +
                "profissional='" + profissional + '\'' +
                ", categoria='" + categoria+ '\'' +
                ", descrição='" + descricao + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
