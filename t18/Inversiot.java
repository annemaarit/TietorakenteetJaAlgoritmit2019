import java.util.*;

public class Inversiot {
    int[] muodosta(int n, long k) {
		int[] luvut = new int[n];
		int[] apu = new int[n];
		luvut[0]=1;
		for (int i=0; i<n-1;i++){
			luvut[i]=i+1;
			luvut[i+1]=i+2;
			apu[i]=0;
			apu[i+1]=0;
		}
		
		
		if ((n>1)&&(k!=0)){
			int kierros=1;
			long summa=n-kierros;
			int a=0;
			int b=n-kierros;
			long max=k;
			while(k>summa){
				apu[b]=luvut[a];
				max-=n-kierros;
				a++;
				kierros++;
				b=n-kierros;
				summa+=n-kierros;
			}			
			kierros--;
			System.out.println("a: "+a+" b: "+b+" summa: "+summa+" k: "+k+" kierros: "+kierros+" max: "+max);
			int j=0;
			for(int i=a;i<n;i++){
				apu[j]=luvut[i];
				j++;
			}
			sekoita(apu,b+1,0,1,max,0,0);
			
		}
		
		return apu;
    }
	
	public void sekoita(int[] t,int n,int a,int b, long max, long kpl, int kierros){
		swap(t,a,b);
		kpl++;
		System.out.println("kpl: "+kpl+" kierros: "+kierros+" a: "+a+" b: "+b);
		if (kpl<max){
			if (b<n-1-kierros){
				sekoita(t,n,b,b+1,max,kpl,kierros);
			}else{
				kierros++;
				if (kierros<n-1){
					sekoita(t,n,0,1,max,kpl,kierros);
				}
			}
		}
	}
	
	public void swap(int[] t, int i, int j){
		int apu = t[i];
		t[i]=t[j];
		t[j]=apu;
	};
}

/*
import java.util.*;

 

public class Inversiot {

    int[] muodosta(int n, long k) {

        int[] t = new int[n];

        int a = 0, b = n-1;

        for (int i = 1; i <= n; i++) {

            if (k >= n-i) {

                t[b--] = i;

                k -= n-i;

            } else {

                t[a++] = i;

            }

        }

        return t;

    }

}*/