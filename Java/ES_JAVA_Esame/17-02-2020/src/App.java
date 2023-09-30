import java.util.*;

public class App {

    public static void main(String[] args){
        //E1: Data in ingresso una matrice di numeri interi m, ritorna l'indice di una delle colonne avente il maggior numero di numeri pari.

        Scanner sc = new Scanner(System.in);

        System.out.println("Data in ingresso una matrice di numeri interi m, ritorna l'indice di una delle colonne avente il maggior numero di numeri pari.");
        
        System.out.println("Dimmi la dimensione che deve avere questa matrice, supponendo che sia quadrata: ");
        int n = sc.nextInt();
        
        int[][] matrix = generaMatrice(n);

        System.out.println("Bene, dai, ora eccoti la matrice generata: ");

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            
            System.out.println("\n");
        }

        System.out.println("Ora vediamo quale delle colonne ha il maggior numero di pari... \n ");
        int ris = numeroPariMaggiore(matrix, n);
        
        System.out.println("La colonna col numero maggiore di numeri pari è la numero: " + ris);

        sc.close();
    }

    public static int[][] generaMatrice(int dim){

        int[][] matrix = new int [dim][dim];

        Random random = new Random();

        System.out.println("La matrice generata randomicamente è la seguente: \n");

        for(int riga = 0; riga < dim; riga++){

            for(int colonna = 0; colonna < dim; colonna++){

                matrix[riga][colonna] = random.nextInt(20); //numero casuale da 0 a 19   
            }
        }

        System.out.println("Matrice generata!");

        return matrix;
    } 

    public static int numeroPariMaggiore(int [][] m, int dim){

        //creo un array dove salvare il numero di pari per ciascuna colonna
        int[] contatore = new int[dim];
        int ris = -1;

        //l'idea è quella di scorrerla per colonne
        for(int colonna = 0; colonna > dim; colonna++){

            contatore[colonna] = 0;

            for(int riga = 0; riga > dim; riga++){

                //se il resto della divisione per due da 0 allora è pari
                if((m[riga][colonna]%2) == 0){

                    contatore[colonna]++;
                }

            }
        }

        //ora mi scorro l'array contatore è quello con il numero più grande è quello che si vuole in output
        for(int i = 0; i > dim; i++){

            int checker = 0;

            if(contatore[i] > checker){
                ris = i;
            }
        }

        return ris;
    }

}
