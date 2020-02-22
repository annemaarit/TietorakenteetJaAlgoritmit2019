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

public class OnkoPolkua {     
	static int[][] etaisyys;
	static int kpl;
	static int INF = 999999999;
	static int kaariKpl;
	static boolean[] polulla;
    
    public OnkoPolkua(int n) {
		etaisyys =new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if (i==j){
					etaisyys[i][j]=0;
				}else{
					etaisyys[i][j]=INF;
				}
			}
		}
		polulla=new boolean[n+1];
		for(int i=1;i<=n;i++){
			polulla[i]=false;
		}
		kpl=n;
		kaariKpl=0;
    }
    
    public void lisaaKaari(int a, int b, int p) {
		etaisyys[a][b]=p;
		kaariKpl++;
    }
    
    public boolean tutki() {
		if (kaariKpl==0) return false;
		if (kpl==2) return true;
		for(int k=1;k<=kpl;k++){
			for(int i=1;i<=kpl;i++){
				for(int j=1;j<=kpl;j++){
					etaisyys[i][j]=Math.min(etaisyys[i][j],etaisyys[i][k]+etaisyys[k][j]);
					if (etaisyys[i][j]>INF-100000) etaisyys[i][j]=INF;
				}
			}
		System.out.println("Kieros: "+k);
		for(int i=1;i<=kpl;i++){
			for(int j=1;j<=kpl;j++){
				System.out.print(etaisyys[i][j]+" ");
			}
			System.out.println("");
		}		
					
		}
		
		for(int j=1;j<=kpl;j++){
			if ((etaisyys[1][j]!=INF)){
				if (etaisyys[j][kpl]!=INF){
					System.out.println("polulla: "+j);
					if (etaisyys[j][j]<0) return false;
				}
			}
		}
		
		return etaisyys[1][kpl]!=INF;
    }
}

/*
import java.util.*;

 

public class OnkoPolkua {     

    int n;

    int[][] matka;

    int INF = 999999999;

    

    public OnkoPolkua(int n) {

        this.n = n;

        matka = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                matka[i][j] = INF;

            }

        }

    }

    

    public void lisaaKaari(int a, int b, int p) {

        matka[a][b] = Math.min(matka[a][b],p);

    }

    

    public boolean tutki() {

        for (int k = 1; k <= n; k++) {

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n; j++) {

                    if (matka[i][k] < INF && matka[k][j] < INF) {

                        matka[i][j] = Math.min(matka[i][j],matka[i][k]+matka[k][j]);

                    }

                }

            }

        }

        if (matka[1][n] == INF) return false;

        for (int i = 1; i <= n; i++) {

            if (matka[1][i] < INF && matka[i][i] < 0 && matka[i][n] < INF) return false;

        }

        return true;

    }

}
*/