package com.digitalinnovation.desafio.poo;

public class Bebida extends Produto {
    private String marca;

    public Bebida(String nome, double qtd, String marca) {
        super(nome, qtd);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
