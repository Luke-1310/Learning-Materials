package com.company;

public class Triangolo extends FiguraGeometrica{

    private double lato1; //base
    private double lato2;
    private double lato3;
    private double lato4; //altezza

    /*Sovrascriviamo il costruttore della classe FiguraGeometrica*/

    public Triangolo(double l1, double l2, double l3, double l4){

        descrizione = "Triangolo";
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
        lato4 = l4;
    }

    public  double perimetro(){

        return (lato1 + lato2 + lato3);
    }


    public  double area(){

        return (lato1 * lato4)/2;
    }


    public  String toString(){

        //Siccome getDescrizione fornisce una stringa, mettendo la
        //concatenazione  col + il quale si utilizza per concatenare stringhe
        //dovrebbe unire e poi restituire stringhe
        return getDescrizione() + "\nBase: " + lato1 + "\nCateto: " + lato2 + "\nCateto: " + lato3 + "\nAltezza: " + lato4;
    }



}
