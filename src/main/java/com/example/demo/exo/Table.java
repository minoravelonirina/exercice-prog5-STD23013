package com.example.demo.exo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Table {
    private double longeur;
    private double largeur;
    private String etat;
    private String couleur;

    public double getSurface() {
        return this.longeur * this.largeur;
    }
}

// portefeuille
//couleur
//porteCarte
//poids
//marque

//getMoney
//addMoney
//checkMoney
//addCard
//lost