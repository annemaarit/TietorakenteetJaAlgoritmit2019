import java.util.*;

class Kaari {
    int alku;
    int loppu;
    int pituus;

    public Kaari(int alku, int loppu, int pituus) {
        this.alku = alku;
        this.loppu = loppu;
        this.pituus = pituus;
    }
}

public class LyhinReitti {  
	static ArrayList<Kaari> kaaret;
	static int kpl;
    
    public LyhinReitti(int n) {
        kaaret = new ArrayList<>();
        kpl=n;
    }
    
    public void lisaaTie(int a, int b, int p) {
        kaaret.add(new Kaari(a,b,p));
    }
    
    public ArrayList<Integer> muodosta(int x, int y) {
        int[] etaisyys = new int[kpl+1];
        ArrayList<Integer>[] reitit=new ArrayList[kpl+1];
        for (int i = 1; i <=kpl; i++) {
            reitit[i]=new ArrayList<Integer>();
            reitit[i].add(i);
        }
        int INF = 999999999;
        for (int i = 1; i <= kpl; i++) {
            etaisyys[i] = INF;
        }
        etaisyys[x] = 0;
	
        if (kpl>1){
            while (true) {
                boolean muutos = false;
                for (Kaari k : kaaret) {
                    if (etaisyys[k.alku]+k.pituus < etaisyys[k.loppu]) {
                        etaisyys[k.loppu] = etaisyys[k.alku]+k.pituus;
                        reitit[k.loppu].clear();
                        for(int reitti : reitit[k.alku])
                        {
                                reitit[k.loppu].add(reitti);
                        }
                        reitit[k.loppu].add(k.loppu);
                        muutos = true;
                    }
                    if (etaisyys[k.loppu]+k.pituus < etaisyys[k.alku]) {
                        etaisyys[k.alku] = etaisyys[k.loppu]+k.pituus;
                        reitit[k.alku].clear();
                        for(int reitti : reitit[k.loppu])
                        {
                                reitit[k.alku].add(reitti);
                        }
                        reitit[k.alku].add(k.alku);					
                        muutos = true;
                    }
                }
                if (!muutos) break;
            }   
            if (reitit[y].size()==1){
                    return null;
            }else{
                    
            }         
        }
        return reitit[y];
    }
}

/*
import java.util.*;

 

public class LyhinReitti {  

    int n, m;

    int[] a = new int[200001];

    int[] b = new int[200001];

    int[] p = new int[200001];

    

    public LyhinReitti(int n) {

        this.n = n;

    }

    

    public void lisaaTie(int a, int b, int p) {

        m++;

        this.a[m] = a;

        this.b[m] = b;

        this.p[m] = p;

        m++;

        this.a[m] = b;

        this.b[m] = a;

        this.p[m] = p;

    }

    

    public ArrayList<Integer> muodosta(int x, int y) {

        int[] matka = new int[n+1];

        int[] mista = new int[n+1];

        int INF = 999999999;

        for (int i = 1; i <= n; i++) matka[i] = INF;

        matka[x] = 0;

        while (true) {

            boolean muutos = false;

            for (int i = 1; i <= m; i++) {

                if (matka[a[i]]+p[i] < matka[b[i]]) {

                    matka[b[i]] = matka[a[i]]+p[i];

                    mista[b[i]] = a[i];

                    muutos = true;

                }

            }

            if (!muutos) break;

        }

        if (matka[y] == INF) return null;

        ArrayList<Integer> reitti = new ArrayList<>();

        int k = y;

        while (k != 0) {

            reitti.add(k);

            k = mista[k];

        }

        Collections.reverse(reitti);

        return reitti;

    }

}

*/
