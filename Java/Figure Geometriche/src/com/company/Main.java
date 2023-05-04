package com.company;
import java.util.Scanner;

public class Main {

    /*Per l'input*/
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ciao ^_^");

        int dim = 3;

        FiguraGeometrica array[] = new FiguraGeometrica[dim];

        int i;

        for(i =0; i < dim; i++){

            System.out.println("Inserisci il numero corrispondente alla figura che desideri: ");
            System.out.println("1: Triangolo \n 2:  Rettangolo\n 3: Quadrato \n 4: Cerchio\n 5: Ellisse");

            int scelta = sc.nextInt();

            switch (scelta){

                case 1:

                    double lato1; //base
                    double lato2;
                    double lato3;
                    double altezza;

                    System.out.println("\nE triangolo sia!\n");

                    System.out.println("Inserisci il valore del primo lato, ovvero la base: \t :)");
                    lato1 = sc.nextDouble();

                    System.out.println("\nInserisci il valore del secondo lato: \t :|");
                    lato2 = sc.nextDouble();

                    System.out.println("\nInserisci il valore del terzo lato: \t :(");
                    lato3 = sc.nextDouble();

                    System.out.println("\nInserisci il valore dell'altezza");
                    altezza = sc.nextDouble();

                    //al costruttore bisogna passare i parametri?
                    Triangolo triangolo = new Triangolo(lato1, lato2, lato3, altezza);

                    System.out.println("Il perimetro del " + triangolo.getDescrizione()+ " vale: " + triangolo.perimetro());
                    System.out.println("L'area del " + triangolo.getDescrizione()+ " vale: " + triangolo.area());

                    array[i] = triangolo;
                    break;

                case 2:

                    double lato_r;//base
                    double lato_r2;//altezza

                    System.out.println("\nE rettangolo sia!\n");

                    System.out.println("Inserisci il valore della base: \t :)");
                    lato_r = sc.nextDouble();

                    System.out.println("\nInserisci il valore dell'altezza: \t :|");
                    lato_r2= sc.nextDouble();

                    Rettangolo rettangolo = new Rettangolo(lato_r, lato_r2);

                    System.out.println("Il perimetro del " + rettangolo.getDescrizione() + " vale: " + rettangolo.perimetro());
                    System.out.println("L'area del " + rettangolo.getDescrizione() + "vale: " + rettangolo.area());

                    array[i] = rettangolo;
                    break;

                case 3:

                    double lato_q;

                    System.out.println("\nE quadrato sia! \n");

                    System.out.println("Inserisci il valore del lato del quadrato: \t ^_^");
                    lato_q = sc.nextDouble();

                    Quadrato quadrato = new Quadrato(lato_q);

                    System.out.println("Il perimetro del " + quadrato.getDescrizione() + " vale: " + quadrato.perimetro());
                    System.out.println("L'area del " + quadrato.getDescrizione() + "vale: " + quadrato.area());

                    array[i] = quadrato;
                    break;

                case 4:

                    double raggio;

                    System.out.println("\nE cerchio sia! \n");

                    System.out.println("Inserisci il valore del raggio del cerchio: \t ç_ç");
                    raggio = sc.nextDouble();

                    Cerchio cerchio = new Cerchio(raggio);

                    System.out.println("Il perimetro del " + cerchio.getDescrizione() + " vale: " + cerchio.perimetro());
                    System.out.println("L'area del " + cerchio.getDescrizione() + "vale: " + cerchio.area());

                    array[i] = cerchio;
                    break;

                case 5:

                    double lato_e1;
                    double lato_e2;

                    System.out.println("\nEd ellisse sia!\n");

                    System.out.println("Inserisci il lato minore dell'ellisse: \t TwT");
                    lato_e1 = sc.nextDouble();

                    System.out.println("Inserisci il lato maggiore dell'ellisse: \t :P");
                    lato_e2 = sc.nextDouble();

                    Ellisse ellisse = new Ellisse(lato_e1, lato_e2);

                    System.out.println("Il perimetro del " + ellisse.getDescrizione() + " vale: " + ellisse.perimetro());
                    System.out.println("L'area del " + ellisse.getDescrizione() + "vale: " + ellisse.area());

                    array[i] = ellisse;
                    break;


                default:
                    System.out.println("Minchia fra, che numero hai messo? *o*");
                    i--;
            }
        }

        for(i = 0; i < dim; i++){

            System.out.println("\n" + array[i].toString() + "\n");

        }
        System.out.println("\n");

        System.out.println("\nInfine stampiamo la somma di tutte le aree..\n");

        sommaAree(array);

        System.out.println("\n My name is Cister Rolando SUIIIIII :) Super memes");
    }

    public static void  sommaAree(FiguraGeometrica array[]){

        double somma = 0;

        for(int i = 0; i < array.length; i++){

            somma = somma + array[i].area();
        }

        System.out.println("La somma è: " + somma);

    }

}


