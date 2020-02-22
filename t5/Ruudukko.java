import java.util.*;

public class Ruudukko {
    int[][] muodosta(int n) {
		Collection<Integer> luvut = new HashSet<>();
		int ruudukko[][]=new int[n][n];
		int luku=0;
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){	
				luvut.clear();
				for (int k=0; k<i;k++){
					luvut.add(ruudukko[k][j]);
				}
				for (int l=0; l<j;l++){
					luvut.add(ruudukko[i][l]);
				}
				luku=0;
				if (!luvut.isEmpty()){
					while (luvut.contains(luku)){
						luku++;
					}		
				}
				ruudukko[i][j]=luku;
			}
		}
		return ruudukko;
    }
}

/*
import java.util.*;

 

public class Ruudukko {

    int[][] muodosta(int n) {

        int[][] r = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                boolean[] mukana = new boolean[2*n];

                for (int k = i-1; k >= 0; k--) {

                    mukana[r[k][j]] = true;

                }

                for (int k = j-1; k >= 0; k--) {

                    mukana[r[i][k]] = true;

                }

                for (int k = 0; ; k++) {

                    if (!mukana[k]) {

                        r[i][j] = k;

                        break;

                    }

                }

            }

        }

        return r;

    }

}

*/