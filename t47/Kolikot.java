import java.util.*;

public class Kolikot {  
	private static boolean[] summat;

    public int laske(int[] t) {
		int n=t.length;
		int max=0;
		int kpl=0;
		for(int kolikko:t) max+=kolikko;
		summat=new boolean[max+1];
		Arrays.fill(summat,false);
		
		summat[0]=true;
		for(int i=0;i<n;i++){
			//System.out.println("i: "+i);
			for(int j=max;j>=0;j--){
				//System.out.println("j: "+j);
				if (summat[j]==true){
					if (summat[j+t[i]]!=true){
						summat[j+t[i]]=true;
						kpl++;
					}
				}
			}
		}
		
		return kpl;
    }
}

/*
import java.util.*;

 

public class Kolikot {  

    public int laske(int[] t) {

        int n = t.length;

        int m = 10000;

        boolean[] d = new boolean[m+1];

        d[0] = true;

        for (int i = 0; i < n; i++) {

            for (int j = m; j >= 0; j--) {

                if (d[j]) d[j+t[i]] = true;

            }

        }

        int r = 0;

        for (int i = 1; i <= m; i++) if (d[i]) r++;

        return r;

    }

}
*/