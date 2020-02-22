import java.util.*;

public class Lentoreitti {  
    static ArrayList<Integer>[] kaupungit;
	static int n;
	
	static int lyhinReitti(int alku, int loppu) {
		ArrayDeque<Integer> jono=new ArrayDeque<>();
		boolean[] vierailtu = new boolean[n+1];
		int[] etaisyys = new int[n+1];
		int kaupunki;
		jono.addLast(alku);
		vierailtu[alku]=true;
		etaisyys[alku]=0;
		while (!jono.isEmpty()){
			kaupunki=jono.getFirst();
			jono.removeFirst();
			for(int naapuri:kaupungit[kaupunki]){
				if (vierailtu[naapuri]) continue;
				jono.addLast(naapuri);
				vierailtu[naapuri]=true;
				etaisyys[naapuri]=etaisyys[kaupunki]+1;
				System.out.println(etaisyys[naapuri]);
				if (naapuri==loppu) return etaisyys[naapuri]-1;
			}
		}
		return -1;
	}
	
    public Lentoreitti(int n) {
		kaupungit = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
            kaupungit[i] = new ArrayList<>();
        }
		this.n=n;
    }
    
    public void lisaaYhteys(int a, int b) {
		kaupungit[a].add(b); kaupungit[b].add(a);
    }
    
    public int laske(int x, int y) {
		return lyhinReitti(x,y);
    }
}

/*
import java.util.*;

 

public class Lentoreitti {  

    int n;

    ArrayList<Integer>[] verkko;

    

    int[] matka;

    final int INF = 999999999; // ääretön

    

    public Lentoreitti(int n) {

        this.n = n;

        verkko = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) verkko[i] = new ArrayList<>();

        matka = new int[n+1];

        for (int i = 1; i <= n; i++) matka[i] = INF;

    }

    

    public void lisaaYhteys(int a, int b) {

        verkko[a].add(b);

        verkko[b].add(a);

    }

    

    public int laske(int x, int y) {

        matka[x] = 0;

        ArrayList<Integer> jono = new ArrayList<>();

        jono.add(x);

        for (int i = 0; i < jono.size(); i++) {

            int solmu = jono.get(i);

            for (Integer naapuri : verkko[solmu]) {

                if (matka[naapuri] == INF) {

                    matka[naapuri] = matka[solmu]+1;

                    jono.add(naapuri);

                }

            }

        }

        if (matka[y] == INF) return -1;

        return matka[y]-1;

    }

}
*/
