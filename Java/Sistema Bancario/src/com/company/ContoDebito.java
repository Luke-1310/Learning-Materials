package com.company;

public abstract class ContoDebito extends ContoCorrente{

    private float interesse;

    public ContoDebito(String cod, String n, String c, float f, float inter){

        super(cod, n, c, f);
        interesse = inter;
    }
    //dopo aver appurato che non c'è un limite, ovvero conto di debito > 0
    //allora una volta estinto il debito, i soldi in più rimarrano nel conto subendo ovviamente l'interesse applicatogli
    public void deposito(int cifra){

        System.out.println("Il tuo corrisponde attualmente a: " + conto);

        conto = conto + cifra;

        System.out.println("Dopo il deposito, il conto corrisponde a: " + conto);

    }

    public void prelievo(int cifra){

        float in; //variabile d'appoggio per calcolare l'interesse sulla cifra effettiva

        in = (cifra/100f)*interesse;

        conto = conto - (cifra+in);

        System.out.println("Il tuo corrisponde attualmente a: " + conto);
        System.out.println("La cifra che vuoi prelvare a: " + cifra + " sapendo che l'interesse corrisponde a " + interesse + "%");
    }
}
