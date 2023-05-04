package com.company;

public class Ellisse extends FiguraGeometrica{

    double lato_minore;
    double lato_maggiore;

    public Ellisse(double l1, double l2){

        descrizione ="Ellisse";
        lato_minore = l1;
        lato_maggiore = l2;
    }

    @Override
    public double perimetro() {
        return 2*3.14*Math.sqrt(((lato_minore*lato_minore) + (lato_maggiore*lato_maggiore))/2);
    }

    public double area(){
        return 3.14*lato_minore*lato_maggiore;
    }

    @Override
    public String toString() {
        return getDescrizione() + "\nLato minore: " + lato_minore + "\nLato maggiore: " + lato_maggiore + "\nPi Greco: " + 3.14;
    }
}
