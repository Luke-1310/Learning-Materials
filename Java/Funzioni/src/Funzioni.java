import java.util.*;

public class Funzioni{
    
    // E1: Data una matrice m di numeri interi, restituisce true se almeno la metà dei suoi elementi è pari a 0; false altrimenti.
    public static boolean if_zero(int [][]m){
        
        boolean ris = false;
        int contatore_elementi = 0;
        int contatore_zeri = 0;

        //a quanto pare .size non va bene per la matrice
        for(int i = 0; i < m.length; i++){

            for(int y = 0; y < m.length; y++){

                if(m[i][y] == 0){
                    contatore_zeri++;
                }

                contatore_elementi++;
            }

        }

        if(contatore_zeri >contatore_elementi / 2){
            ris = true;
        }

        return ris;
    }

    // E2: Dato in ingresso un carattere c e una collezione di stringhe sc, per ogni stringa s nella collezione stampare a video il numero di volte che il carattere c compare in s.
    public static void stampa_c(HashSet<String> sc, char c){
        
        Iterator<String> it = sc.iterator();
        int contatore = 0;

        while(it.hasNext()){

            String corrente = it.next();

            for(int i = 0; i < corrente.length(); i++){

                if(corrente.charAt(i) == c){
                    contatore++;
                }

            }

            System.out.println("Nella stringa " + corrente + " compare il carattere " + c + " ben "+ contatore +" volte");

            contatore = 0;

        }

    }

    // E1: Data in ingresso una matrice di numeri interi m, ritorna l'indice di una delle colonne avente il maggior numero di numeri pari.
    public static int num_pari(int [][]m){
        
        int indice = 0;
        int conta_pari = 0;
        int max = 0;

        int[] array = new int [m.length];

        for(int y=0; y < m.length; y++){

            for(int i=0; i < m.length; i++){
                
                if(m[y][i] % 2 == 0){
                    conta_pari++;
                }
            }

            array[y] = conta_pari;
            conta_pari = 0;
        }

        for(int z = 0; z < m.length; z++){

            if(array[z] > max){
                max = array[z];
                indice = z;
            }
        }

        return indice;
    }


    // E2: Data una stringa s ed una mappa m con chiavi intere e valori stringhe, ritorna l'insieme delle chiavi aventi come valore s.

    



}
