import java.util.*;

public class Permutaatiot {  
	static boolean[] m;
	static int[] luvut;
	static int laskuri;
    
    public int laske(int n) {
		m = new boolean[n+1];
		luvut = new int[n+1];
		laskuri=0;
		haku(1,n);
		return laskuri;
    }
	
	private void haku(int k, int n){
		if (k==n+1) {		
			laskuri++;
		}else{
			for (int i=1;i<=n;i++){
				if (m[i]!=true){
					m[i]=true;
					luvut[k]=i;
					if (k>1){
						if (Math.abs(luvut[k]-luvut[k-1])!=1){
							haku(k+1,n);
						}
					}else{
						haku(k+1,n);
					}
					m[i]=false;
				}
			}
		}
	}
}

/*
import java.util.*;

 

public class Permutaatiot {  

    boolean[] p;

    int c;

    

    void haku(int n, int r, int e) {

        if (r == n) {

            c++;

            return;

        }

        for (int i = 1; i <= n; i++) {

            if (p[i] || Math.abs(i-e) == 1) continue;

            p[i] = true;

            haku(n,r+1,i);

            p[i] = false;

        }

    }

    

    public int laske(int n) {

        p = new boolean[n+1];

        c = 0;

        haku(n,0,-1);

        return c;

    }

}
*/