import java.util.*;

class Tehtava implements Comparable<Tehtava> {
    String nimi;
    int kiireellisyys;
    
    public Tehtava(String n, int k) {
        nimi = n;
        kiireellisyys = k;
    }
    
    public int compareTo(Tehtava t) {
        if (kiireellisyys < t.kiireellisyys) {
            return 1;
        } else {
			if (kiireellisyys>t.kiireellisyys){
				return -1;
			}else{
				return nimi.compareTo(t.nimi);
			}	
		}
    }
}

public class Tehtavat {
	PriorityQueue<Tehtava> tehtavat = new PriorityQueue<>();
        
    
    public void lisaa(String nimi, int kiireellisyys) {
		tehtavat.add(new Tehtava(nimi,kiireellisyys));
    }
    
    public String hae() {
		Tehtava t=tehtavat.poll();
		return t.nimi;
    }
}

/*
import java.util.*;

 

public class Tehtavat {

    class Tehtava implements Comparable<Tehtava> {

        public String nimi;

        public int kiireellisyys;

        

        public Tehtava(String nimi, int kiireellisyys) {

            this.nimi = nimi;

            this.kiireellisyys = kiireellisyys;

        }

        

        public int compareTo(Tehtava toinen) {

            if (this.kiireellisyys != toinen.kiireellisyys) {

                return toinen.kiireellisyys-this.kiireellisyys;

            } else {

                return this.nimi.compareTo(toinen.nimi);

            }

        }

    }

    

    PriorityQueue<Tehtava> jono = new PriorityQueue<>();

    

    public void lisaa(String nimi, int kiireellisyys) {

        jono.add(new Tehtava(nimi,kiireellisyys));

    }

    

    public String hae() {

        return jono.poll().nimi;

    }

}
*/
