import java.util.*;

public class Mediaani {
	PriorityQueue<Integer> vasen = new PriorityQueue<>(10,Collections.reverseOrder());
	PriorityQueue<Integer> oikea = new PriorityQueue<>();
	
    public void lisaa(int x) {
		int l=0;
		long vSize=vasen.size();
		long oSize=oikea.size();
		if (vSize==0){
			vasen.add(x);
			//System.out.println("Vasen: "+x);
		} else {
			if (oSize==0){
				if (x<vasen.peek()){
					l=vasen.poll();
					vasen.add(x);
					oikea.add(l);
				}else{
					oikea.add(x);
				}
				//System.out.println("Oikea: "+x);
			}else{
				if (x>vasen.peek()){
					if (oSize>=vSize){
						if (x<oikea.peek()){
							vasen.add(x);
						}else{
							l=oikea.poll();
							vasen.add(l);
							oikea.add(x);
						}
					}else{
						oikea.add(x);
					};
				}else{
					if (vSize>oSize){
						l=vasen.poll();
						oikea.add(l);
					}
					vasen.add(x);
				}
			}
		}
    }
    
    public int mediaani() {
		System.out.println("Oikea: "+oikea.peek());
		return vasen.peek();
    }
}

/*
import java.util.*;

 

public class Mediaani {

    PriorityQueue<Integer> vasen = new PriorityQueue<>(10,Collections.reverseOrder());

    PriorityQueue<Integer> oikea = new PriorityQueue<>();

    

    public void lisaa(int x) {

        if (vasen.isEmpty() || x <= vasen.peek()) vasen.add(x);

        else oikea.add(x);

        while (oikea.size() > vasen.size()) vasen.add(oikea.poll());

        while (vasen.size() > oikea.size()+1) oikea.add(vasen.poll());

    }

    

    public int mediaani() {

        return vasen.peek();

    }

}
*/