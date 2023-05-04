package com.company;
public abstract class ContoCorrente {

    String codice;
    String nome;
    String cognome;

    float conto;

    public ContoCorrente(String cod, String n, String c, float s) {

        codice = cod;
        nome = n;
        cognome = c;

        conto = s;
    }

    public String getNome(){
        return nome;}

    public String getCodice(){
        return codice;}

    public String getCognome(){
        return cognome;}

    public float getConto(){
        return conto;}


    public void setNome(String n){
        nome = n;}

    public void setCognome(String cognome) {
        this.cognome = cognome;}

    public abstract void deposito(int cifra);
    public abstract  void prelievo(int cifra);
}
