import java.util.*;

public class Tanssiaiset {     
    static int[][] verkko;
    static int[][] alussa;
    static int[] tila; // 0 = ei käyty, 1 = käyty
    static ArrayDeque<Integer> polku = new ArrayDeque<>();
    static boolean loytyi;
    static int N;
    static int M;
    static int indN=1;  //kumpulan aloitus indeksi
    static int indM;    //viikin aloitus indeksi
    static int kpl;     //solmujen yhteismäärä
    
    public Tanssiaiset(int n, int m) {
        N=n;
        M=m;
        indM=indN+n;
        kpl=indN+n+m+1;
        verkko = new int[kpl+1][kpl+1];
        alussa = new int[kpl+1][kpl+1];
        tila = new int[kpl+1];
    }

    public void lisaaPari(int a, int b) {
        a+=indN;
        b+=indM;
        verkko[a][b] = 1;
        alussa[a][b] = 1;
        verkko[1][a] = 1;
        alussa[1][a] = 1;
        verkko[b][kpl] = 1;
        alussa[b][kpl] = 1;
    }

    static void syvyyshaku(int s) {
        if (tila[s] == 1) return;
        if (loytyi) return;
        polku.addLast(s);
        if (s == kpl) {
            loytyi = true;
            return;
        }
        tila[s] = 1;
        for (int i = 1; i <= kpl; i++) {
            if (verkko[s][i] > 0) {
                syvyyshaku(i);
            }
        }
        if (loytyi) return;
        polku.removeLast();
    }
    
    public void tulostaMatriisi(){
        for (int i = 1; i <= kpl; i++) {
            for (int j = 1; j <= kpl; j++) {
                System.out.print(verkko[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public ArrayList<Pari> muodosta() {
        ArrayList<Pari> parit = new ArrayList<Pari>();
        do{
            tila = new int[kpl+1];
            polku = new ArrayDeque<>();
            loytyi=false;
            syvyyshaku(1);
            if (loytyi) {
                System.out.println(polku);
                int pienin = 999999999;
                int edellinen = 0;
                for (Integer nykyinen : polku) {
                    if (edellinen != 0) {
                        pienin = Math.min(pienin,verkko[edellinen][nykyinen]);
                    }
                    edellinen = nykyinen;
                }
                System.out.println("Pienin: "+pienin);
                edellinen = 0;
                for (Integer nykyinen : polku) {
                    if (edellinen != 0) {
                        verkko[edellinen][nykyinen] -= pienin;
                        verkko[nykyinen][edellinen] += pienin;
                    }
                    edellinen = nykyinen;
                }
            }
        } while (loytyi);
        tulostaMatriisi();
        for (int i = 2; i < kpl; i++) {
            for (int j = 2; j < kpl; j++) {
                if (alussa[i][j] > 0 && alussa[i][j] != verkko[i][j]) {
                     parit.add(new Pari(i-indN, j-indM));
                }
            }
        }
        return parit;
    }    
}

/*
import java.util.*;

 

public class Tanssiaiset {     

    int N = 100;

    int n, m;

    int[][] alku;

    int[][] paino;

    

    public Tanssiaiset(int n, int m) {

        this.n = n;

        this.m = m;

        alku = new int[2*N+2][2*N+2];

        paino = new int[2*N+2][2*N+2];

        for (int i = 1; i <= n; i++) paino[0][i] = 1;

        for (int i = 1; i <= m; i++) paino[N+i][2*N+1] = 1;

    }

 

    public void lisaaPari(int a, int b) {

        if (alku[a][N+b] == 1) return;

        alku[a][N+b] = 1;

        paino[a][N+b] = 1;

    }

    

    int[] tila;

    

    int haku(int s, int u) {

        if (s == 2*N+1) return u;

        if (tila[s] == 1) return 0;

        tila[s] = 1;

        for (int i = 0; i <= 2*N+1; i++) {

            if (paino[s][i] > 0) {

                int h = haku(i,Math.min(u,paino[s][i]));

                if (h > 0) {

                    paino[s][i] -= h;

                    paino[i][s] += h;

                    return h;

                }

            }

        }

        return 0;

    }

    

    public ArrayList<Pari> muodosta() {

        while (true) {

            tila = new int[2*N+2];

            int u = haku(0,1);

            if (u == 0) break;

        }

        ArrayList<Pari> tulos = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (alku[i][N+j] == 1 && paino[i][N+j] == 0) {

                    tulos.add(new Pari(i,j));

                }

            }

        }

        return tulos;

    }    

}
*/