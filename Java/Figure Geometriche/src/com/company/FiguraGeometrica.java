package com.company;

public abstract class FiguraGeometrica {

    protected String descrizione;

    /*  costruttore, mettiamo solamente il campo descrizione
        visto che è l'unico attributo in comune tra tutte le
        classi derivanti da FiguraGeometrica */

    public FiguraGeometrica(){
        descrizione = "d";}

    public void setDescrizione(String d){
        descrizione = d;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public abstract double perimetro();
    public abstract double area();
    public abstract String toString();
}
