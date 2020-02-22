import java.util.*;

public class Lukujono {
	private PriorityQueue<Long> luvut;
	private SortedSet<Long> s;
	
	//288555831593533440L
	
    public long laske(int n) {
		luvut = new PriorityQueue<>();
		s = new TreeSet<>();

		teeKeko(1);
		
		luvut.poll();
		
		while (n!=1){
			luvut.poll();
			n--;
		}
		
		return luvut.poll();
    }
	
	private void teeKeko(long luku){
		if (luku>288555831593533440L) return;

		luvut.add(luku);
		s.add(luku);
		//System.out.println(luku);

		long l2=luku*2;
		long l3=luku*3;
		long l5=luku*5;
		if (s.contains(l2)==false){
			teeKeko(l2);
		}
		if (s.contains(l3)==false){
			teeKeko(l3);
		}
		if (s.contains(l5)==false){
			teeKeko(l5);
		}
	}
}

/*
import java.util.*;

 

public class Lukujono {

    public long laske(int n) {

        PriorityQueue<Long> jono = new PriorityQueue<>();

        jono.add(1L);

        long vanha = 0;

        int maara = -1;

        while (true) {

            long luku = jono.poll();

            if (luku == vanha) continue;

            vanha = luku;

            maara++;

            if (maara == n) return luku;

            jono.add(luku*2);

            jono.add(luku*3);

            jono.add(luku*5);

        }

    }

}
*/