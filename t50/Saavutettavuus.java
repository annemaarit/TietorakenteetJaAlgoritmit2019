import java.util.*;

public class Saavutettavuus {  
    static ArrayList<Integer>[] koneet;
	static int[] tila;
	static int kpl;
	
    static void syvyyshaku(int kone) {
		//System.out.println("yritetään mennä solmuun "+kone);
        if (tila[kone] == 1) return;
		//System.out.println("päästiin solmuun "+kone);
        tila[kone] = 1;
		kpl++;
        for (int naapuri : koneet[kone]) {
            syvyyshaku(naapuri);
        }
    }
	
    public Saavutettavuus(int n) {
		koneet = new ArrayList[n+1];
		tila = new int[n+1];
		for (int i = 1; i <= n; i++) {
            koneet[i] = new ArrayList<>();
        }
		kpl=0;
    }
    
    public void lisaaYhteys(int a, int b) {
		koneet[a].add(b); koneet[b].add(a);
    }
    
    public int laske(int x) {
		syvyyshaku(x);
		return kpl-1;
    }
}

/*
import java.util.*;

 

public class Saavutettavuus {  

    int n;

    ArrayList<Integer>[] verkko;

    

    int[] tila;

    int tulos;

    private void haku(int solmu) {

        if (tila[solmu] == 1) return;

        tulos++;

        tila[solmu] = 1;

        for (Integer naapuri : verkko[solmu]) {

            haku(naapuri);

        }

    }

    

    public Saavutettavuus(int n) {

        this.n = n;

        verkko = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) verkko[i] = new ArrayList<>();

        tila = new int[n+1];

    }

    

    public void lisaaYhteys(int a, int b) {

        verkko[a].add(b);

        verkko[b].add(a);

    }

    

    public int laske(int x) {

        tulos = 0;

        haku(x);

        return tulos-1;

    }

}
*/