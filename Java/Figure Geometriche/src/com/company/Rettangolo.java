package com.company;

public class Rettangolo extends FiguraGeometrica{

    double base;
    double altezza;

    public Rettangolo(double b, double h){

        descrizione = "Rettangolo";
        base = b;
        altezza = h;

    }

    @Override
    public double perimetro() {
        return (base*2)+(altezza*2);
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public String toString() {
        return getDescrizione() + "\nBase: \n" + base + "\nAltezza: \n" + altezza;
    }
}
