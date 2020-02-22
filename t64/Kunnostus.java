import java.util.*;

class Kaari {
    int alku; 
    int loppu;
    int paino;
    
    public Kaari(int a, int l, int p) {
        this.alku = a;
        this.loppu = l;
        this.paino = p;
    }
}

class solmuComparator implements Comparator<Kaari>{ 
    public int compare(Kaari k1, Kaari k2) { 
        if (k1.paino > k2.paino) return 1; 
        if (k1.paino < k2.paino) return -1; 
        return 0; 
    }
}

public class Kunnostus {     
    static PriorityQueue<Kaari> keko;
    static int[] vanhempi;
    static int[] koko;
    static int N;

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
    }
    
    public Kunnostus(int n) {
        keko = new PriorityQueue<Kaari>(n, new solmuComparator());
        alusta(n);
        N=n;
    }
    
    public void lisaaTie(int a, int b, int x) {
        Kaari k = new Kaari(a, b, x);
        keko.add(k);
    }
    
    public int laske() {
        int kustannus=0;
        int kpl=0;
        Kaari k;
        while (!keko.isEmpty()&&(kpl<=N)){
            k=keko.poll();
            if (etsiHuippu(k.alku)!=etsiHuippu(k.loppu)){
                kpl++;
                kustannus+=k.paino;
            } 
            yhdista(k.alku, k.loppu);
        }
        if (N==1) return 0;
        if (kpl<N-1) return -1;
        return kustannus;
    }
}

/*
import java.util.*;

 

public class Kunnostus {     

    int n;

    int[] vanhempi, koko;

 

    int edustaja(int x) {

        while (x != vanhempi[x]) x = vanhempi[x];

        return x;

    }

    

    void yhdista(int a, int b) {

        a = edustaja(a);

        b = edustaja(b);

        if (a == b) return;

        if (koko[a] > koko[b]) {

            koko[a] += koko[b];

            vanhempi[b] = a;

        } else {

            koko[b] += koko[a];

            vanhempi[a] = b;

        }

    }    

    

    class Kaari implements Comparable<Kaari> {

        int alku, loppu, paino;

        

        public Kaari(int alku, int loppu, int paino) {

            this.alku = alku;

            this.loppu = loppu;

            this.paino = paino;

        }

        

        public int compareTo(Kaari k) {

            return paino-k.paino;

        }

    }

    

    ArrayList<Kaari> kaaret = new ArrayList<>();

    

    public Kunnostus(int n) {

        this.n = n;

        vanhempi = new int[n+1];

        koko = new int[n+1];

        for (int i = 1; i <= n; i++) {

            vanhempi[i] = i;

            koko[i] = 1;

        }

    }

    

    public void lisaaTie(int a, int b, int x) {

        kaaret.add(new Kaari(a,b,x));

    }

    

    public int laske() {

        Collections.sort(kaaret);

        int tulos = 0;

        int maara = 0;

        for (Kaari k : kaaret) {

            if (edustaja(k.alku) != edustaja(k.loppu)) {

                maara++;

                tulos += k.paino;

                yhdista(k.alku,k.loppu);

            }

        }

        return maara == n-1 ? tulos : -1;

    }

 

}

*/