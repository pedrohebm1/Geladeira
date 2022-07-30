package com.digitalinnovation.desafio.poo;

import java.util.List;

public class Produto {
    private String nome;
    private double qtd;

    public Produto(String nome, double qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }
}
