import java.util.*;

public class PieninEtaisyys {
	private TreeMap<Integer,Integer>luvut=new TreeMap<>();
	private int pienin=-1;
    
    public void lisaa(int x) {
		int prev;
		int next;
		int ero;
		if (luvut.isEmpty()){
			luvut.put(x,1);
		} else {
			if (luvut.containsKey(x)){
				luvut.put(x,(luvut.get(x)+1));
			}else{
				luvut.put(x,1);
				if (luvut.higherKey(x)!=null){
					prev=luvut.higherKey(x);
					ero=prev-x;
					if (pienin!=-1){
						pienin=(ero<pienin)?ero:pienin;
					}else{
						pienin=ero;
					}
				}
				if (luvut.lowerKey(x)!=null){
					next=luvut.lowerKey(x);
					ero=x-next;
					if (pienin!=-1){
						pienin=(ero<pienin)?ero:pienin;
					}else{
						pienin=ero;
					}
				}				
			}
		}
    }

    public int laske() {
		return pienin;
    }

}

/*
import java.util.*;

 

public class PieninEtaisyys {

    TreeSet<Integer> t = new TreeSet<>();

    int pienin = 1000000000;

    

    public void lisaa(int x) {

        t.add(x);

        Integer a = t.lower(x);

        if (a != null) pienin = Math.min(pienin,x-a);

        Integer b = t.higher(x);

        if (b != null) pienin = Math.min(pienin,b-x);

    }

 

    public int laske() {

        return pienin;

    }

}
*/