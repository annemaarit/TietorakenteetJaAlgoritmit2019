public class Piirileikki {
	private int numero;
	
    int viimeinen(int n) {
		int[] piiri=new int[n];
		for (int i=1;i<=n;i++){
				piiri[i-1]=i;
		}
		piiriPyorii(piiri,0);
		return numero;
    }

	private void piiriPyorii(int[] p, int alku){
		int koko=p.length;
		int n;
		if (koko%2==0){
			n=koko/2;
		}else{
			n=koko/2+1-alku;
		}
		
		int[] jaavat=new int[n];
		
		int j=0;
		int i=alku;
		while (i<koko){
			jaavat[j]=p[i];
			//System.out.print(jaavat[j]+" ");
			j++;			
			i+=2;
		}
		if (jaavat[j-1]==(p[koko-1])){
			alku=1;
		}else{
			alku=0;
		}

		//System.out.println("i: "+i+" koko: "+koko+" n: "+n+" alku: "+alku);
		
		numero=jaavat[0];
		
		if (j==1)return;		
		
		piiriPyorii(jaavat,alku);
	}
}

/*
public class Piirileikki {

    int viimeinen(int n) {

        int[] t = new int[2*n];

        for (int i = 0; i < n; i++) t[i] = i+1;

        int k = n-1;

        for (int i = 0; i <= k; i++) {

            if (i%2 == 0) t[++k] = t[i];

        }

        return t[k];

    }

}
*/

	