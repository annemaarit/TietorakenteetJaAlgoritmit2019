import java.util.*;

public class Komponentit {     
    static int[] vanhempi;
    static int[] koko;
    static int N;
    static int laskuri;

    static void alusta(int n) {
        vanhempi = new int[n+1];
        koko = new int[n+1];
        for (int i = 1; i <= n; i++) {
            vanhempi[i] = i;
            koko[i] = 1;
        }
    }

    static int etsiHuippu(int x) {
        while (vanhempi[x] != x) {
            x = vanhempi[x];
        }
        return x;
    }

    public void yhdista(int a, int b) {
        a = etsiHuippu(a);
        b = etsiHuippu(b);
        if (a == b) {
            return;
        }
        if (koko[a]<koko[b]){
            int apu=a;
            a=b;
            b=apu;
        }
        vanhempi[b]=a;
        koko[a]+=koko[b];
        laskuri--;
    }
    
    public Komponentit(int n) {
        alusta(n);
        N=n;
        laskuri=n;
    }   
    
    public int laske() {
        return laskuri;
    }

}

/*
import java.util.*;

 

public class Komponentit {     

    int n;

    int[] vanhempi, koko;

    int maara;

    

    public Komponentit(int n) {

        this.n = n;

        vanhempi = new int[n+1];

        koko = new int[n+1];

        for (int i = 1; i <= n; i++) {

            vanhempi[i] = i;

            koko[i] = 1;

        }

        maara = n;

    }

 

    public void yhdista(int a, int b) {

        while (a != vanhempi[a]) a = vanhempi[a];

        while (b != vanhempi[b]) b = vanhempi[b];

        if (a == b) return;

        if (koko[a] > koko[b]) {

            koko[a] += koko[b];

            vanhempi[b] = a;

        } else {

            koko[b] += koko[a];

            vanhempi[a] = b;

        }

        maara--;

    }    

    

    public int laske() {

        return maara;

    }

 

}
*/