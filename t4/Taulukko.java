import java.util.*;

public class Taulukko {
    int laske(int[] t) {
		int pituus=t.length;
		if (pituus==1){
			return t[0];
		} else {
			int[] taulu = new int[pituus-1];
			for (int i=0; i<pituus-1; i++){
				taulu[i]=t[i]+t[i+1];
			} 
				return laske(taulu);
		} 
		
    }
}

/*
import java.util.*;

 

public class Taulukko {

    int laske(int[] t) {

        while (t.length > 1) {

            int[] u = new int[t.length-1];

            for (int i = 0; i < t.length-1; i++) {

                u[i] = t[i]+t[i+1];

            }

            t = u;

        }

        return t[0];

    }

}

*/