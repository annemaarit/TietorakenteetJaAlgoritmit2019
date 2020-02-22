import java.util.*;

public class Polut {  
	static int [][] kayty;
	static int laskuri;
    
    public int laske(int n) {
		laskuri=0;
		kayty = new int [n][n];
		haku(0,0,1,n);
		if (n==1){
			return 1;
		}else{
			return laskuri*2;
		}
    }
	
	
    private void haku(int x, int y, int k, int n) {
        if (x < 0 || y < 0 || x >= n || y >= n) return;
        if (kayty[x][y] != 0) return;
		
		if (y==0){
			if (((x-1)>=0)&&((x+1)<n)){
				if ((kayty[x-1][y]==0)&&(kayty[x+1][y]==0)) return;
			}			
		}
		
		if (x==0){
			if (((y-1)>=0)&&((y+1)<n)){
				if ((kayty[x][y-1]==0)&&(kayty[x][y+1]==0)) return;
			}
		}
		
		if (((y-1)>=0)&&((y+1)<n)){
			
			if ((kayty[x][y-1]==0)&&(kayty[x][y+1]==0)){
				
				if (x==0){
					if (x+1<n){
						if (kayty[x+1][y]!=0)return;
					}else{
						return;
					}
				}
				
				if (x==n-1){
					if (x-1>0){
						if (kayty[x-1][y]!=0)return;
					}else{
						return;
					}
				}
				
			}
				
		}
		
		if (((x-1)>=0)&&((x+1)<n)){
			
			if ((kayty[x-1][y]==0)&&(kayty[x+1][y]==0)){
				
				if (y==0){
					if (y+1<n){
						if (kayty[x][y+1]!=0)return;
					}else{
						return;
					}
				}
				
				if (y==n-1){
					if (y-1>0){
						if (kayty[x][y-1]!=0)return;
					}else{
						return;
					}
				}
				
			}
				
		}

		
		
		
        if (k == n*n) {
            laskuri++;
            /*for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(kayty[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("ratkaisu "+laskuri);*/
            return;
        }
        kayty[x][y] = k;
		if (x==0&&y==0){
			haku(x,y+1,k+1,n);
		}else{
			haku(x,y+1,k+1,n);
			haku(x+1,y,k+1,n);
			haku(x,y-1,k+1,n);
			haku(x-1,y,k+1,n);
		}
		kayty[x][y] = 0;
    }

}

/*
import java.util.*;

 

public class Polut {  

    boolean[][] p;

    int c;

    

    void haku(int y, int x, int n, int k) {

        if (k == n*n) {

            c++;

        } else {

            if (p[y][x-1] && p[y][x+1] && !p[y-1][x] && !p[y+1][x]) return;

            if (!p[y][x-1] && !p[y][x+1] && p[y-1][x] && p[y+1][x]) return;

            p[y][x] = true;

            if (!p[y-1][x]) haku(y-1,x,n,k+1);

            if (!p[y+1][x]) haku(y+1,x,n,k+1);

            if (!p[y][x-1]) haku(y,x-1,n,k+1);

            if (!p[y][x+1]) haku(y,x+1,n,k+1);

            p[y][x] = false;

        }

    }

    

    public int laske(int n) {

        p = new boolean[n+2][n+2];

        for (int i = 0; i < n+2; i++) {

            for (int j = 0; j < n+2; j++) {

                if (i == 0 || i == n+1) p[i][j] = true;

                if (j == 0 || j == n+1) p[i][j] = true;

            }

        }

        c = 0;

        haku(1,1,n,1);

        return c;

    }

}
*/