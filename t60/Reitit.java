import java.util.*;

public class Reitit {     
    static ArrayList<Integer>[] verkko;
    static ArrayList<Integer> solmut;
    static boolean[] solmu;
    static ArrayList<Integer> topologinen;
    static int[] tila; //0=ei käyty, 1=kesken, 2=valmis
    static int kpl;
    static long[] reitit;

    
    public Reitit(int n) {
        tila = new int[n+1];
        solmut = new ArrayList<>();
        topologinen = new ArrayList<>();
        verkko = new ArrayList[n+1];
        solmu = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            verkko[i] = new ArrayList<>();
            solmu[i]=false;
        }
        kpl=n;
        reitit = new long[n+1];
    }
    
    static void lisaaKaari(int a, int b) {
        verkko[a].add(b);
        lisaaSolmu(a);
        lisaaSolmu(b);
    }

    static public void lisaaSolmu(int s){
        if (!solmu[s]){
            solmu[s]=true;
            solmut.add(s);
            //reitit[s]=1;
        }
    }

    static void syvyyshaku(int s) { //topologiseen järjestykseen, huom lisäksi vielä listan kääntö
        if (tila[s] == 2) return;
        if (tila[s] == 1) return;
        tila[s] = 1;
        for (int naapuri : verkko[s]) {
            syvyyshaku(naapuri);
        }
        tila[s]=2;
        topologinen.add(s);
    }

    public long laske() {
        int s;
        for(int i=0;i<solmut.size();i++){
            s=solmut.get(i);
            syvyyshaku(s);
            //if (sykli) break;
        }
        //if (sykli) return null;
        //if (tuloslista.size()==1) return null;
        
        reitit[1]=1;
        for(int i=(topologinen.size()-1);i>=0;i--){ //käännetty järjestys
            s=topologinen.get(i);
            for (int naapuri : verkko[s]) {
                reitit[naapuri]=reitit[naapuri]+reitit[s];
                System.out.println("naapuri= " +naapuri+" "+reitit[naapuri]+" kpl");
            }         
            
        }

        return reitit[kpl];
    }

}

/*
import java.util.*;

 

public class Reitit {     

    int n;

    ArrayList<Integer>[] mista;

    long[] muisti;

    

    public Reitit(int n) {

        this.n = n;

        mista = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {

            mista[i] = new ArrayList<>();

        }

        muisti = new long[n+1];

        Arrays.fill(muisti,-1);

    }

 

    public void lisaaKaari(int a, int b) {

        mista[b].add(a);

    }

    

    private long laske(int b) {

        if (b == 1) return 1;

        if (muisti[b] != -1) return muisti[b];

        long tulos = 0;

        for (int a : mista[b]) {

            tulos += laske(a);

        }

        muisti[b] = tulos;

        return tulos;

    }

    

    public long laske() {

        return laske(n);

    }

 

}
*/