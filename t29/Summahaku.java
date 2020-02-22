import java.util.*;

public class Summahaku {
    long laske(int[] t, int x) {
		HashMap<Long,Long>osajoukot=new HashMap<>();
		int n=t.length;
		long summaus=0;
		long erotus=0;
		long kpl=0;
		
		for(int i=0;i<n;i++){
			if (i>0){
				summaus+=t[i];
			}else{
				summaus=t[i];
			}
			
			if (summaus==x){
				kpl++;
			}
			
			erotus=summaus-x;
			if(osajoukot.containsKey(erotus)){
				kpl+=osajoukot.get(erotus);
			}
			
			if(osajoukot.containsKey(summaus)){
				osajoukot.put(summaus,osajoukot.get(summaus)+1);
			}else{
				osajoukot.put(summaus,(long)1);
			}
			
		}
		
		return kpl;	
    }
}
		
		
		
/*import java.util.*;

 

public class Summahaku {

    long laske(int[] t, int x) {

        HashMap<Long,Integer> h = new HashMap<>();

        h.put(0L,1);

        long summa = 0, tulos = 0;

        for (int i = 0; i < t.length; i++) {

            summa += t[i];

            tulos += h.getOrDefault(summa-x,0);

            h.put(summa,h.getOrDefault(summa,0)+1);

        }

        return tulos;

    }

}*/
		
