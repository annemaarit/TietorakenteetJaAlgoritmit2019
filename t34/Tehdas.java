import java.util.*;

public class Tehdas {
	class Kone implements Comparable<Kone> {
		private int nopeus;
		private long next;
		
		public Kone(int nopeus, long next) {
			this.nopeus = nopeus;
			this.next = next;
		}
		
		public int compareTo(Kone k) {
			if (this.next < k.next) {
				return -1;
			} else {
				return 1;	
			}
		}
	}
    
    public long laske(int[] t, int x) {
		PriorityQueue<Kone> valmis = new PriorityQueue<>();
		for (int i=0;i<t.length;i++){
			valmis.add(new Kone(t[i],(long)t[i]));
		}
		
		Kone k;
		k=valmis.poll();
		long nyt=k.nopeus;
		int kpl=1;
		k.next=nyt+k.nopeus;
		valmis.add(k);
		while (kpl<x){
			k=valmis.poll();
			nyt=k.next;
			k.next=nyt+k.nopeus;
			valmis.add(k);
			kpl++;
			
		}
		
		return nyt;
    }
 
}
/*
import java.util.*;

 

public class Tehdas {

    class Tehtava implements Comparable<Tehtava> {

        public int kesto;

        public long valmis;

        

        public Tehtava(int kesto, long valmis) {

            this.kesto = kesto;

            this.valmis = valmis;

        }

        

        public int compareTo(Tehtava toinen) {

            if (this.valmis < toinen.valmis) return -1;

            if (this.valmis > toinen.valmis) return 1;

            return 0;

        }

    }

    

    public long laske(int[] t, int x) {

        PriorityQueue<Tehtava> jono = new PriorityQueue<>();        

        for (int i = 0; i < t.length; i++) {

            jono.add(new Tehtava(t[i],t[i]));

        }

        long vika = 0;

        for (int i = 0; i < x; i++) {

            Tehtava u = jono.poll();

            vika = u.valmis;

            jono.add(new Tehtava(u.kesto,u.valmis+u.kesto));

        }

        return vika;

    }

 

/*  // vaihtoehtoinen ratkaisutapa:

 

    // saako ajassa u valmistettua tarpeeksi tuotteita?

    private boolean ok(int[] t, int x, long u) {

        long r = 0;

        for (int i = 0; i < t.length; i++) {

            r += u/t[i];

            if (r >= x) return true;

        }

        return false;

    }

    

    // etsitään pienin mahdollinen aika binäärihaulla

    public long laske(int[] t, int x) {

        long u = 0;

        for (long b = 1000000000000L; b >= 1; b /= 2) {

            while (!ok(t,x,u+b)) u += b;

        }

        return u+1;

    }

*/

   