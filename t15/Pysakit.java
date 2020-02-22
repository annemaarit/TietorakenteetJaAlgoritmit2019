import java.util.*;

public class Pysakit {
    int laske(int[] t, int k) {
		Arrays.sort(t);
		int pituus=t.length;
		int[] min=new int[pituus];
		int[] max=new int[pituus];
		int pysakit=0;
		int eka=0;
		for (int i=1; i<pituus; i++){
			if (t[i]-t[eka]>2*k){
				pysakit++;
				eka=i;
			}
		}
		pysakit++;
		return pysakit;
    }
}

/*
    int laske(int[] t, int k) {

        Arrays.sort(t);

        int n = t.length;

        int laskuri = 0;

        int kohta = -1000000000;

        for (int i = 0; i < n; i++) {

            if (t[i]-kohta > k) {

                laskuri++;

                kohta = t[i]+k;

            }

        }

        return laskuri;

    }
*/