package com.company;
import java.util.Scanner;

public class ContoCredito extends ContoCorrente{

    static Scanner sc = new Scanner(System.in);

    private int operazioni_max = 5;
    private int operazioni = 0;
    private int commissione = 1;        //in termini percentuali

    public ContoCredito(String cod, String n, String c, float conto){
        //metodo utilizzato per "passare" i campi del costruttore della classe ContoCorrente
        super(cod, n, c, conto);
    }

    //per poter leggere e modificare il valore della commissione, si fa un get ed un set
    public void setCommissione(int comm){
        commissione = comm;
    }

    public int getCommissione(){
        return commissione;
    }


    public void deposito(int cifra){

        conto = conto + cifra;

        operazioni ++;
    }

    public void prelievo(int cifra){

        float sost;
        float calcolo_interesse = 0;

        sost = conto - cifra;

        //controllo per non prelvare un quantitativo di soldi tale da mandare in negativo il conto
        while(sost < 0){

            System.out.println("Sembra che tu voglia prelevare una cifra maggiore rispetto a quella disponibile nel conto ç_ç");
            System.out.println("\nInserisci una nuova cifra da prelevare, ricordando che il saldo corrisponde a " + conto + "€:");
            cifra = sc.nextInt();

            sost = conto - cifra;
        }

        if(operazioni >= operazioni_max){
            calcolo_interesse = (cifra/100f)*commissione;
        }

        conto = sost- calcolo_interesse;

        operazioni ++;
    }

    public void reset(){

        System.out.println("Ok! Azzeriamo il numero di operazioni effettuate...");
        operazioni = 0;
    }
}