import java.util.*;

public class SamatLuvut {
    private TreeMap<Integer,Integer>luvut=new TreeMap<>();
	
	
    public void lisaa(int x) {
		if (luvut.isEmpty()){
			luvut.put(x,1);
		} else {
			if (luvut.containsKey(x)){
				luvut.put(x,(luvut.get(x)+1));
			}else{
				luvut.put(x,1);				
			}
		}
    }

    public void poista(int x) {
		if (luvut.containsKey(x)){
			int kpl=luvut.get(x);
			if (kpl>1){
				luvut.put(x,(luvut.get(x)-1));
			}else{
				luvut.remove(x);
			}
		}
    }    
    
    public int pienin() {
		return luvut.firstKey();
    }
}

/*
import java.util.*;

 

public class SamatLuvut {

    TreeMap<Integer,Integer> t = new TreeMap<>();

    

    public void lisaa(int x) {

        t.put(x,t.getOrDefault(x,0)+1);

    }

 

    public void poista(int x) {

        int c = t.getOrDefault(x,0);

        if (c == 0) return;

        if (c == 1) t.remove(x);

        else t.put(x, c-1);

    }    

    

    public int pienin() {

        return t.firstKey();

    }

}
*/