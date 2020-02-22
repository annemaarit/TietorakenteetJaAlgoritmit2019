import java.util.*;

public class Viestinta {  
    static ArrayList<Integer>[] koneet;
	static int[] tila;
	static int n;
	static int[] komponentit;
	static int kpl;
	
    static void syvyyshaku(int kone) {
        if (tila[kone] == 1) return;
        tila[kone] = 1;
        for (int naapuri : koneet[kone]) {
            komponentit[naapuri]=kpl;
            syvyyshaku(naapuri);
        }
    }
    
    public Viestinta(int n) {
        koneet = new ArrayList[n+1];
        komponentit = new int[n+1];
        for (int i = 1; i <= n; i++) {
            koneet[i] = new ArrayList<>();
        }
        this.n=n;
        kpl=0;
    }
    
    public void lisaaYhteys(int a, int b) {
        koneet[a].add(b); koneet[b].add(a);
    }
    
    public boolean tarkasta(int x, int y) {
        tila = new int[n+1];
        if (komponentit[x]==0){
            kpl++;
            komponentit[x]=kpl;
            syvyyshaku(x);
        }

        return (komponentit[x]==komponentit[y]);
    }
}

/*
import java.util.*;

 

public class Viestinta {  

    int n;

    ArrayList<Integer>[] verkko;

    

    int[] tila;

    private void haku(int solmu, int vari) {

        if (tila[solmu] != 0) return;

        tila[solmu] = vari;

        for (Integer naapuri : verkko[solmu]) {

            haku(naapuri,vari);

        }

    }

    

    public Viestinta(int n) {

        this.n = n;

        verkko = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) verkko[i] = new ArrayList<>();

        tila = new int[n+1];

    }

    

    public void lisaaYhteys(int a, int b) {

        verkko[a].add(b);

        verkko[b].add(a);

    }

    

    public boolean tarkasta(int x, int y) {

        if (tila[1] == 0) {

            int vari = 0;

            for (int i = 1; i <= n; i++) {

                if (tila[i] != 0) continue;

                vari++;

                haku(i,vari);

            }

        }

        return tila[x] == tila[y];

    }

}
*/