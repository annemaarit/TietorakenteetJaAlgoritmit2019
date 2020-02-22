import java.util.*;

public class Ruudukko {     
    static int solmut[][];
    static int huoneet[][];
    static int[] vanhempi;
    static int[] koko;
    static int N;
    static int laskuri;

    static void alusta(int n) {
        int kpl=n*n;
        vanhempi = new int[kpl+1];
        koko = new int[kpl+1];
        for (int i = 1; i <= kpl; i++) {
            vanhempi[i] = i;
            koko[i] = 1;
        }
        int tunnus=1;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                solmut[x][y]=tunnus;
                tunnus++;
            }
        }
    }

    static int etsiHuippu(int x) {
        while (vanhempi[x] != x) {
            x = vanhempi[x];
        }
        return x;
    }

    public boolean yhdista(int a, int b) {
        a = etsiHuippu(a);
        b = etsiHuippu(b);
        if (a == b) {
            return false;
        }
        if (koko[a]<koko[b]){
            int apu=a;
            a=b;
            b=apu;
        }
        vanhempi[b]=a;
        koko[a]+=koko[b];
        return true;
    }
    
    public Ruudukko(int n) {
        solmut = new int[n+2][n+2];
        huoneet = new int[n+2][n+2];
        alusta(n);
        N=n*n;
        laskuri=0;
    }
    
    public void teeLattia(int y, int x) {
        if (huoneet[x][y]==0){
            int yhdistyi=-1;
            huoneet[x][y]=1;
            if (huoneet[x-1][y]==1){
                if (yhdista(solmut[x][y],solmut[x-1][y])) yhdistyi++;
            } 
            if (huoneet[x+1][y]==1){
                if (yhdista(solmut[x][y],solmut[x+1][y])) yhdistyi++;
            } 
            if (huoneet[x][y-1]==1){
                if (yhdista(solmut[x][y],solmut[x][y-1])) yhdistyi++;
            } 
            if (huoneet[x][y+1]==1){
                if (yhdista(solmut[x][y],solmut[x][y+1])) yhdistyi++;
            } 
            if (yhdistyi==-1){
                laskuri++;
            }else{
                laskuri-=yhdistyi;
            }
        }
    }
    
    public int laskeHuoneet() {
        return laskuri;
    }

}

/*
import java.util.*;

 

public class Ruudukko {     

    int n;

    int[] vanhempi, koko, tila;

    int maara;

 

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

    

    public Ruudukko(int n) {

        this.n = n;

        vanhempi = new int[n*n];

        koko = new int[n*n];

        for (int i = 0; i < n*n; i++) {

            vanhempi[i] = i;

            koko[i] = 1;

        }

        tila = new int[n*n];

        maara = 0;

    }

    

    void tutki(int a, int b) {

        if (b >= 0 && b < n*n && tila[b] == 1 && edustaja(a) != edustaja(b)) {

            yhdista(a,b);

            maara--;

        }

    }

    

    public void teeLattia(int y, int x) {

        int k = (y-1)*n+x-1;

        if (tila[k] == 1) return;

        tila[k] = 1;

        maara++;

        tutki(k,k-n);

        tutki(k,k+n);

        if (k%n != 0) tutki(k,k-1);

        if (k%n != n-1) tutki(k,k+1);

    }

    

    public int laskeHuoneet() {

        return maara;

    }

 

}
*/
