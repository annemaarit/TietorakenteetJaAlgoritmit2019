import java.util.*;

public class PieninEro {
    int laske(int[] t) {
		Arrays.sort(t);
		int pituus=t.length;
		int pienin=t[1]-t[0];
		int erotus=0;
		if (pituus>2){
			for (int i=2; i<pituus-1;i++){
				erotus=t[i]-t[i-1];
				if(erotus<pienin){
					pienin=erotus;
				}
			}			
		}
		return pienin;
    }
}

/*
import java.util.*;

 

public class PieninEro {

    int laske(int[] t) {

        Arrays.sort(t);

        int ero = t[1]-t[0];

        for (int i = 1; i < t.length; i++) {

            ero = Math.min(ero,t[i]-t[i-1]);

        }

        return ero;

    }

}
*/