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
	static ArrayList<Kaari> kaaret = new ArrayList<>();
	static int kpl;
    
    public LyhinReitti(int n) {
		kpl=n;
    }
    
    public void lisaaTie(int a, int b, int p) {
        kaaret.add(new Kaari(a,b,p));
    }
    
    public int laske(int x, int y) {
        int[] etaisyys = new int[kpl+1];
        int INF = 999999999;
        for (int i = 1; i <= kpl; i++) {
            etaisyys[i] = INF;
        }
        etaisyys[x] = 0;
        while (true) {
            boolean muutos = false;
            for (Kaari k : kaaret) {
                if (etaisyys[k.alku]+k.pituus < etaisyys[k.loppu]) {
                    etaisyys[k.loppu] = etaisyys[k.alku]+k.pituus;
                    muutos = true;
                }
                if (etaisyys[k.loppu]+k.pituus < etaisyys[k.alku]) {
                    etaisyys[k.alku] = etaisyys[k.loppu]+k.pituus;
                    muutos = true;
                }
            }
            if (!muutos) break;
        }
		
		if (etaisyys[y]!=INF){
			return etaisyys[y];
		}else{
			return -1;
		}
    }
}
