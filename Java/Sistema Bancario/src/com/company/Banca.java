package com.company;

public class Banca {

    private String nomeBanca;
    private int limite = 100;
    private int contatore = -1;

    private ContoCorrente [] array = new ContoCorrente[limite];

    public Banca(String nome){
        nomeBanca = nome;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public int getContatore() {
        return contatore;
    }

    public ContoCorrente[] getArray() {

        return array;
    }

    public void aggiungiConto(ContoCorrente c){

        if(contatore >= limite){
            System.out.println("LIMITE CONTI RAGGIUNTO");
            return;
        }

        contatore ++;
        array[contatore] = c;

    }

    public void bilancioTotale(){

        float somma = 0;

        for(int i = 0; i <= contatore; i++){

            somma += array[i].getConto();
        }

        System.out.println("LA SOMMA TOTALE DEI SALDI CORRISPONDE A: " + somma);
    }

    public void stampa(){

        System.out.println("NOME BANCA: " + getNomeBanca());

        for(int i = 0; i <= contatore; i++){

            System.out.println("NOME PROPRIETARIO: " + array[i].getNome());
            System.out.println("COGNOME PROPRIETARIO: " + array[i].getCognome());
            System.out.println("CODICE CONTO: " + array[i].getCodice());
            System.out.println("SALDO CONTO: " + array[i].getConto());
        }
    }
}
