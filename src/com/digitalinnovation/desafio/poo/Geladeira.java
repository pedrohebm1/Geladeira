package com.digitalinnovation.desafio.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Geladeira {
    private String marca;

    private List<Bebida> bebidas = new ArrayList<>();
    private List<Comida> comidas = new ArrayList<>();

    public Geladeira(String marca, List<Bebida> bebidas, List<Comida> comidas) {
        this.marca = marca;
        this.bebidas = bebidas;
        this.comidas = comidas;
    }

    public void listarBebidas() {
        System.out.println("----------------------------");
        System.out.println("Dentro da geladeira da marca " + this.getMarca() + "possui as seguintes bebidas:");
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.println("Bebida: " +
                    this.getBebidas().get(i).getNome() +
                    " | Marca: " +
                    this.getBebidas().get(i).getMarca() +
                    " | Quantidade: " +
                    this.getBebidas().get(i).getQtd()
            );
        }
    }

    public void listarComidas() {
        System.out.println("----------------------------");
        System.out.println("Dentro da geladeira da marca " + this.getMarca() + "possui as seguintes comidas:");
        for (int i = 0; i < comidas.size(); i++) {
            System.out.println("Comida: " +
                    this.getComidas().get(i).getNome() +
                    " | Marca: " +
                    this.getComidas().get(i).getMarca() +
                    " | Quantidade: " +
                    this.getComidas().get(i).getQtd()
            );
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }
}
