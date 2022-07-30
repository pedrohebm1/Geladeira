package com.digitalinnovation.desafio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bebida b1 = new Bebida("Suco de uva", 4, "Del valle");
        Comida c1 = new Comida("Lasanha", 4, "Sadia");

        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(b1);

        List<Comida> comidas = new ArrayList<>();
        comidas.add(c1);

        Geladeira consul = new Geladeira("Consul", bebidas, comidas) {};
        consul.listarBebidas();
        consul.listarComidas();
    }
}
