import java.util.*;

public class Komponentit {  
    static ArrayList<Integer>[] koneet;
	static int[] tila;
	static int lkm;

    static void syvyyshaku(int kone) {
        if (tila[kone] == 1) return;
        tila[kone] = 1;
        for (int naapuri : koneet[kone]) {
            syvyyshaku(naapuri);
        }
    }
    
    public Komponentit(int n) {
		koneet = new ArrayList[n+1];
		tila = new int[n+1];
		for (int i = 1; i <= n; i++) {
            koneet[i] = new ArrayList<>();
        }
		lkm=n;
    }
    
    public void lisaaYhteys(int a, int b) {
		koneet[a].add(b); koneet[b].add(a);
    }
    
    public int laske() {
		int kpl=0;
		for (int kone=1;kone<=lkm;kone++) {
			if (tila[kone]==0){
				syvyyshaku(kone);
				kpl++;
			}   
        }
		return kpl;
    }
}

/*
import java.util.*;

 

public class Komponentit {  

    int n;

    ArrayList<Integer>[] verkko;

    

    int[] tila;

    private void haku(int solmu) {

        if (tila[solmu] == 1) return;

        tila[solmu] = 1;

        for (Integer naapuri : verkko[solmu]) {

            haku(naapuri);

        }

    }

    

    public Komponentit(int n) {

        this.n = n;

        verkko = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) verkko[i] = new ArrayList<>();

        tila = new int[n+1];

    }

    

    public void lisaaYhteys(int a, int b) {

        verkko[a].add(b);

        verkko[b].add(a);

    }

    

    public int laske() {

        int tulos = 0;

        for (int i = 1; i <= n; i++) {

            if (tila[i] == 1) continue;

            haku(i);

            tulos++;

        }

        return tulos;

    }
}
*/