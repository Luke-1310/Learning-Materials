package com.company;

public class Cerchio extends FiguraGeometrica{

    double raggio;

    public Cerchio(double r){

        descrizione = "Cerchio";
        raggio = r;
    }

    @Override
    public double perimetro() {
        return 2*3.14*raggio;
    }

    @Override
    public double area() {
        return 3.14*raggio*raggio;
    }

    @Override
    public String toString() {
        return getDescrizione() + "\nRaggio: " + raggio + "\nPi Greco: " + 3.14;
    }
}
