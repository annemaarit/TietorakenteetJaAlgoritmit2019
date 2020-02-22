import java.util.*;

public class Alijonot {  
	static long[] pisin;
	static ArrayDeque<Integer> lista;
	static ArrayDeque<Integer> ind;
	
    public long laske(int[] t) {
		int n=t.length;
		pisin=new long[n];
		lista=new ArrayDeque<>();
		ind=new ArrayDeque<>();
		long suurin=1;
		
		for(int k=0;k<=n-1;k++){
			pisin[k]=1;
			for(int x=0; x<=k-1;x++){
				//if ((t[x]<t[k])&&(pisin[x]+1>pisin[k])){
				if ((Math.abs(t[x]-t[k])==1)&&(pisin[x]+1>pisin[k])){
					pisin[k]=pisin[x]+1;
					lista.addLast(t[x]);
					ind.addLast(x);
					if (pisin[k]>suurin){
						suurin=pisin[k];
					}else{
						lista.removeLast();
						ind.removeLast();
					}
				}
			}			
		}
		
		System.out.println(lista);
		System.out.println(ind);
		
		return suurin;
    }
}

/*
import java.util.*;

 

public class Alijonot {  

    public long laske(int[] t) {

        int n = t.length;

        int[] d = new int[n];

        int r = 0;

        for (int i = 0; i < n; i++) {

            d[i] = 1;

            for (int j = 0; j < i; j++) {

                if (Math.abs(t[j]-t[i]) == 1) {

                    d[i] = Math.max(d[i],d[j]+1);

                }

            }

            r = Math.max(r,d[i]);

        }

        return r;

    }

}
*/