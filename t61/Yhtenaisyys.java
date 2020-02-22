import java.util.*;

public class Yhtenaisyys {     
    static ArrayList<Integer>[] verkko;
    static ArrayList<Integer> solmut;
    static int[] tila;
    static boolean[] solmu;
    static int kpl;
    static int N;

    static void syvyyshaku(int s) {
        if (tila[s] == 1) return;
        tila[s] = 1;
        kpl++;
        for (int naapuri : verkko[s]) {
            syvyyshaku(naapuri);
        }
    }
    
    public Yhtenaisyys(int n) {
        verkko = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            verkko[i] = new ArrayList<>();
        }
        solmut = new ArrayList<>();
        solmu = new boolean[n+1];
        for (int i = 1; i <= n; i++) solmu[i] = false;
        N=n;
    }

    public void lisaaKaari(int a, int b) {
        verkko[b].add(a);
        lisaaSolmu(a);
        lisaaSolmu(b);
    }

    static public void lisaaSolmu(int s){
        if (!solmu[s]){
            solmu[s]=true;
            solmut.add(s);
        }
    }
        
    public boolean tutki() {
        if (solmut.isEmpty() && N>1) return false;
        for (int s : solmut) {
            //System.out.println("solmu: "+s);
            kpl=0;
            tila = new int[N+1];
            syvyyshaku(s);
            //System.out.println("size: "+solmut.size()+" kpl: "+kpl);
            if (kpl!=N) return false;
        }
        return true;
    }

}

/*
import java.util.*;

 

public class Yhtenaisyys {     

    int n;

    boolean[][] reitti;

    

    public Yhtenaisyys(int n) {

        this.n = n;

        reitti = new boolean[n+1][n+1];

    }

 

    public void lisaaKaari(int a, int b) {

        reitti[a][b] = true;

    }

        

    public boolean tutki() {

        for (int k = 1; k <= n; k++) {

            for (int a = 1; a <= n; a++) {

                for (int b = 1; b <= n; b++) {

                    if (reitti[a][k] && reitti[k][b]) {

                        reitti[a][b] = true;

                    }

                }

            }

        }

        for (int a = 1; a <= n; a++) {

            for (int b = 1; b <= n; b++) {

                if (a != b && !reitti[a][b]) return false;

            }

        }

        return true;

    }

 

}
*/