import java.util.*;

public class Maksimivirtaus {  
    static int n;
    static int[][] verkko;
    static int[] tila; // 0 = ei käyty, 1 = käyty
    static ArrayDeque<Integer> polku = new ArrayDeque<>();
    static boolean loytyi;
    static int N;
    static int INF = 999999999;
    
    public Maksimivirtaus(int n) {
        verkko = new int[n+1][n+1];
        tila = new int[n+1];
        N=n;
    }

    static void syvyyshaku(int s) {
        if (tila[s] == 1) return;
        if (loytyi) return;
        polku.addLast(s);
        if (s == N) {
            loytyi = true;
            return;
        }
        tila[s] = 1;
        for (int i = 1; i <= N; i++) {
            if (verkko[s][i] > 0) {
                syvyyshaku(i);
            }
        }
        if (loytyi) return;
        polku.removeLast();
    }

    public void lisaaKaari(int a, int b, int p) {
        verkko[a][b] += p;
    }
    
    public int laske() {
        int maximi=0;
        do{
            tila = new int[N+1];
            polku = new ArrayDeque<>();
            loytyi=false;
            syvyyshaku(1);
            if (loytyi) {
                int pienin = INF;
                int edellinen = 0;
                for (Integer nykyinen : polku) {
                    if (edellinen != 0) {
                        pienin = Math.min(pienin,verkko[edellinen][nykyinen]);
                    }
                    edellinen = nykyinen;
                }
                maximi+=pienin;
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
        return maximi;
    }    
}

/*
import java.util.*;

 

public class Maksimivirtaus {     

    int n;

    int[][] paino;

    int tulos;

    

    public Maksimivirtaus(int n) {

        this.n = n;

        paino = new int[n+1][n+1];

    }

 

    public void lisaaKaari(int a, int b, int p) {

        paino[a][b] += p;        

    }

    

    int[] tila;

    

    int haku(int s, int u) {

        if (s == n) return u;

        if (tila[s] == 1) return 0;

        tila[s] = 1;

        for (int i = 1; i <= n; i++) {

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

    

    public int laske() {

        while (true) {

            tila = new int[n+1];

            int u = haku(1,1<<20);

            if (u == 0) break;

            tulos += u;

        }

        return tulos;

    }    

}
*/