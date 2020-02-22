import java.util.*;

public class Osajoukot {  
    static int laskuri=0;
	static int[] v;
	
    public int laske(int[] t, int x) {
		int n=t.length;
		v=new int[n];
		laskuri=0;
		haku(0,n,t,x);
		return laskuri;
    }
	
	private void haku(int k, int n, int[] t, int x){
		if (k == n){
			long summa=0;
			for (int j=0;j<n;j++){
				summa+=v[j]*t[j];
			}
			if (summa==x) laskuri++;
			return;
		}else{
			for(int i=0;i<2;i++){
				v[k]=i;
				haku(k+1,n,t,x);
			}
		}
	}
}

/*
import java.util.*;

 

public class Osajoukot {  

    int c;

    

    void haku(int[] t, int k, int s, int x) {

        if (s > x) return;

        if (k == t.length) {

            if (s == x) c++;

            return;

        }

        haku(t,k+1,s,x);

        haku(t,k+1,s+t[k],x);

    }

    

    public int laske(int[] t, int x) {

        c = 0;

        haku(t,0,0,x);

        return c;

    }

}
*/