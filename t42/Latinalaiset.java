import java.util.*;

public class Latinalaiset {  
	static boolean[] m;
	static int[] rivi;
	static int [][] rivit;
	static int[] nelio;
	static int neliot;
	static int r;
	static int askel;

    
    public int laske(int n) {
		if (n==1){
			neliot++;
		}else{
			askel=1;
			for (int i=1;i<=n-1;i++){
					askel*=i;	
			}
			int kpl=1;
			for (int i=1;i<=n;i++){
				kpl*=i;	
			}
			
			nelio=new int[n];
			
			rivit = new int[kpl][n];
			rivi = new int[n+1];
			m = new boolean[n+1];
			r=0;
			teeRivit(1,n);
			
			/*for (int j=0;j<kpl;j++){
				for (int i=0;i<n;i++){
					System.out.print(" "+rivit[j][i]);
				}	
				System.out.println("");
			}		*/
			
			neliot=0;
			haku(kpl,n,n);
			
		}
		return neliot;
    }
	 
	private void teeRivit(int k, int n){
		if (k==n+1){
			for (int j=1;j<=n;j++){
				rivit[r][j-1]=rivi[j];
			}
			r++;
		}else{
			for (int i=1;i<=n;i++){
				if (m[i]!=true){
					m[i]=true;
					rivi[k]=i;
					teeRivit(k+1,n);
					m[i]=false;
				}
			}
		}
	}
	
	private boolean onkoOk(int n){
		int rivi;
		for(int i=0;i<n;i++){
			rivi=nelio[i];
			if (i<n-1){
				for(int j=i+1;j<n;j++){
					if (rivi==nelio[j]) return false;
				}
			}
		}	
		
		int luku=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				luku=rivit[nelio[i]][j];
				//System.out.println(luku);
				if (i<n-1){
					for(int k=i+1;k<n;k++){
						if (luku==rivit[nelio[k]][j])return false;
						//System.out.println("Hylätty");
					}
				}
			}
		}
					
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(rivit[nelio[i]][j]+" ");
			}
		}
		System.out.println(" ");*/
		
		return true;
	}
	
	
    private void haku(int kpl, int k, int n) {
        if (k == 0) {
			if (onkoOk(n)==true){
				neliot++;
			}
			/*for(int i=0;i<n;i++){
				System.out.print(nelio[i]+" ");
			}
			System.out.println(" ");*/
            return;
        }
        for (int i = 0; i < kpl; i++) {
			nelio[k-1]=i;
            haku(kpl,k-1,n);
        }
    }
	
}

/*
import java.util.*;

 

public class Latinalaiset {  

    boolean[][] rivi;

    boolean[][] sarake;

    int laskuri;

    

    // metodi sijoittaa luvun kohtaan (y,x) ja jatkaa seuraavaan kohtaan

    void haku(int y, int x, int n) {

        if (y == n) {

            // ruudukko on täynnä -> kasvatetaan laskuria

            laskuri++;

        } else if (x == n) {

            // rivi on täynnä -> siirrytään seuraavalle riville

            haku(y+1,0,n);

        } else {

            for (int i = 1; i <= n; i++) {

                // koetetaan sijoittaa luku i kohtaan (y,x)

                // rivi[y][i] tarkoittaa: rivillä y esiintyy luku i

                // sarake[x][i] tarkoittaa: sarakkeessa x esiintyy luku i

                if (rivi[y][i] || sarake[x][i]) continue;

                rivi[y][i] = sarake[x][i] = true;

                // siirrytään seuraavaan sarakkeeseen

                haku(y,x+1,n);

                rivi[y][i] = sarake[x][i] = false;

            }

        }

    }

    

    public int laske(int n) {

        rivi = new boolean[n][n+1];

        sarake = new boolean[n][n+1];

        laskuri = 0;

        haku(0,0,n);

        return laskuri;

    }

}

 
*/