import java.util.*;

public class Ruudukko {  
	private static int[][] summat;
	static int n;

	
    public long laske(int[][] t) {
		n=t[0].length;
		summat=new int[n+1][n+1];
		
		for(int y=1;y<=n;y++){
			for(int x=1;x<=n;x++){
				summat[y][x]=t[y-1][x-1];
			}
		}
		
		for(int y=1;y<=n;y++){
			for(int x=1;x<=n;x++){
				if ((y==1)&&(x==1)){
					summat[y][x]=summat[y][x];
				}else{
					if (summat[y-1][x]>summat[y][x-1]){
						summat[y][x]=summat[y][x]+summat[y-1][x];
					}else{
						summat[y][x]=summat[y][x]+summat[y][x-1];
					}
				}
			}
		}
		
		System.out.println("");
		for(int y=0;y<=n;y++){
			for(int x=0;x<=n;x++){
				System.out.print(summat[y][x]+" ");
			}
			System.out.println("");
		}
		
		return summat[n][n];
    }
	
	/*private void reitit(int y, int x, int[][] t,long s){
		s+=t[y][x];
		//System.out.print(t[y][x]+" ");
		
		if ((y==n-1)&&(x==n-1)){
			//System.out.println("");
			//System.out.println(" Summa: "+s);
			if (s>suurin) suurin=s;
			return;
		}else{
			if (y==n-1){
				reitit(y,x+1,t,s);
			}else{
				if(x==n-1){
					reitit(y+1,x,t,s);
				}else{
					if(t[y+1][x]==t[y][x+1]){
						//System.out.print(" --JAKO-- ");
						reitit(y+1,x,t,s); 
						reitit(y,x+1,t,s);
					}else{
						if (t[y+1][x]>t[y][x+1]){
							reitit(y+1,x,t,s);
						}else{
							reitit(y,x+1,t,s);
						}
					}
				}
			}
		}
	}*/
	
}
/*
import java.util.*;

 

public class Ruudukko {  

    public long laske(int[][] t) {

        int n = t.length;

        int[][] d = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int v1 = i > 0 ? d[i-1][j] : 0;

                int v2 = j > 0 ? d[i][j-1] : 0;

                d[i][j] = t[i][j]+Math.max(v1,v2);

            }

        }

        return d[n-1][n-1];

    }

}
*/