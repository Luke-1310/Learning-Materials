package com.company;

public class Quadrato extends FiguraGeometrica{

    double lato;

    public Quadrato(double l){

        descrizione = "Quadrato";
        lato = l;
    }

    @Override
    public double perimetro() {

        return lato*4;
    }

    @Override
    public double area() {

        return lato * lato;
    }

    public String toString(){

        return getDescrizione() + "\nLato: " + lato;
    }

}
