package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int a;
        boolean controllo = true;

        Banca b = new Banca("Monte dei Paschi di Siena");

        System.out.println("Benvenuto/a");

        while(controllo){

            System.out.println("PREMI 1 PER AGGIUNGERE UN CONTO DI DEBITO");
            System.out.println("PREMI 2 PER AGGIUNGERE UN CONTO DI CREDITO");
            System.out.println("PREMI 3 PER DEPOSITARE DEI SOLDI");
            System.out.println("PREMI 4 PER PRELEVARE DEI SOLDI");
            System.out.println("PREMI 5 PER STAMPARE LA SOMMA DI TUTTI I SALDI");
            System.out.println("PREMI 6 PER STAMPARE TUTTI I CONTI");
            System.out.println("PREMI 99 PER USCIRE");

            System.out.println("SCEGLI L'OPERAZIONE CHE VUOI COMPIERE");
            a = obj.nextInt();

            switch(a){

                case 1:

                    System.out.println("INSERISCI IL NOME DEL PROPRIETARIO DEL CONTO: ");
                    String nome = obj.next();

                    System.out.println("INSERISCI IL COGNOME DEL PROPRIETARIO DEL CONTO: ");
                    String cognome = obj.next();

                    System.out.println("INSERISCI IL SALDO INIZIALE: ");
                    float saldo = obj.nextFloat();

                    System.out.println("INSERISCI IL CODICE DEL CONTO: ");
                    String codice = obj.next();

                    System.out.println("INSERISCI IL TASSO DI INTERESSE DEL CONTO: ");
                    float interesse = obj.nextFloat();

                    b.aggiungiConto(new ContoDebito(codice, nome, cognome, saldo, interesse) {
                    });
                    break;

                case 2:

                    System.out.println("INSERISCI IL NOME DEL PROPRIETARIO DEL CONTO: ");
                    String n = obj.next();

                    System.out.println("INSERISCI IL COGNOME DEL PROPRIETARIO DEL CONTO: ");
                    String c = obj.next();

                    System.out.println("INSERISCI IL SALDO INIZIALE: ");
                    System.out.println("INSERISCI IL CODICE DEL CONTO: ");
                    String cod = obj.next();

                    System.out.println("INSERISCI I CASH NEL CONTO: ");
                    int conto = obj.nextInt();

                    b.aggiungiConto(new ContoCredito(cod,n,c,conto));
                    break;

                case 3:

                    System.out.println("INSERISCI CODICE:");
                    String co = obj.next();

                    for(int i = 0; i <= b.getContatore(); i++){

                        if(co.equals(b.getArray()[i].getCodice())){
                            System.out.println("QUANTI CASH VUOI IMMETTERE: ");
                            int cashIn = obj.nextInt();
                            b.getArray()[i].deposito(cashIn);
                            break;
                        }

                    }

                    break;

                case 4:

                    System.out.println("INSERISCI CODICE:");
                    String code = obj.next();

                    for(int i = 0; i <= b.getContatore(); i++){

                        if(code.equals(b.getArray()[i].getCodice())){
                            System.out.println("QUANTO CHAIN VUOI PRELEVARE: ");
                            int cashOut = obj.nextInt();
                            b.getArray()[i].prelievo(cashOut);
                            break;
                        }

                    }

                    break;

                case 5:

                    System.out.println("STAMPA DELLA SOMMA DI TUTTI I SALDI: ");
                    b.bilancioTotale();
                    break;

                case 6:

                    System.out.println("STAMPA TOTALE: ");
                    b.stampa();
                    break;

                case 99:
                    System.out.println("ARRIVEDERCIIIIIIIIIIIIIIII!");
                    controllo = false;
                    break;

                default:
                    System.out.println("SCELTA NON VALIDA D:");
                    break;
            }
        }

        obj.close();
    }
}
