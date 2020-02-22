import java.util.*;
//pienin on 42, suurin 84

public class Tehtavat {  
	private static long[] muisti;
	private static int max = 84;
	private static int min = 42;
	private static int kpl;

	
    public long laske(int x) {	
		muisti=new long[max+1];
		kpl=0;
		
		laske(3,1,x);
		
		/*for (int i=3;i<=6;i++){
			laske(i,1,x);
		}*/
		
		
		/*long kpl=0;
		int a=42;
		while (a<=78){
			for (int i=0;i<4;i++){
				for (int j=a+i;j<=(a+i)+4;j++){
					System.out.print(j+" ");
					if (a==x) kpl++;
				}
				System.out.println("");
			}
			a++;
			System.out.println("-----------");
		}
		
		return kpl;	*/
		
		//for (int i=0;i<=max;i++) System.out.println("i: "+i+" "+muisti[i]);
		//laske(x,kpl);
		
		//return muisti[x];
		return kpl;
    }
	
	/*private void laske(int pisteet, int v){
		if (v==1){
			muisti[pisteet]+=1;
			return;
		}
		v--;
		laske(pisteet-3,v);
		laske(pisteet-4,v);
		laske(pisteet-5,v);
		laske(pisteet-6,v);
	}*/

	private void laske(int p, int v, int x){
		if (v==14){
			if (p==x) kpl++;
			if (p+1==x) kpl++;
			if (p+2==x) kpl++;
			if (p+3==x) kpl++;
			return;
		}
		v++;
		laske(p+3,v,x);
		laske(p+4,v,x);
		laske(p+5,v,x);
		laske(p+6,v,x);
	}
	
	
}