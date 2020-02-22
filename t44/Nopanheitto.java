import java.util.*;

public class Nopanheitto {
	static long muisti[];
	
    public long laske(int n) {
		if (n>6){
			muisti=new long[n+1];
		}else{
			muisti=new long[7];
		}
		
		muisti[0]=1;
		muisti[1]=1;
		muisti[2]=2;
		muisti[3]=4;
		muisti[4]=8;
		muisti[5]=16;
		muisti[6]=32;
		
		if (n>6)heitot(n);
		
		return muisti[n];
    }
	

	private void heitot(int n) { 
		long tulos;
		for(int i=7;i<=n;i++){
			tulos=muisti[i-1]+muisti[i-2]+muisti[i-3]+muisti[i-4]+muisti[i-5]+muisti[i-6];
			muisti[i]=tulos; 
			//System.out.println(i);
		}
	}
		
}

/*
import java.util.*;

 

public class Nopanheitto {  

    public long laske(int n) {

        long[] d = new long[n+1];

        d[0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 6 && i-j >= 0; j++) {

                d[i] += d[i-j];

            }

        }

        return d[n];

    }

}
*/