import java.util.*;

public class HatutJaPallot {
	ArrayList<Integer>[] hatut;
    ArrayList<Integer>[] pallot;
	int n=1000;
	int eiTyhjia=0;
	int suurin=0;
	
	public HatutJaPallot(){
        hatut = new ArrayList[n];
		pallot = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            hatut[i] = new ArrayList<>();
        }
        pallot = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            pallot[i] = new ArrayList<>();
        }
	}
	
    void lisaaPallo(int x) {
		int h=x%n;
		if (hatut[h].size()==0){
			hatut[h].add(x);
			pallot[h].add(1);
			eiTyhjia++;
			if (suurin==0) suurin++;
		}else{
			boolean lisatty=false;
			for(int i=0;i<hatut[h].size();i++){
				if (hatut[h].get(i).equals(x)){
					int kpl=pallot[h].get(i);
					kpl++;
					pallot[h].set(i,kpl);
					if (kpl>suurin){
						suurin=kpl;
					}
					lisatty=true;
					i=hatut[h].size();
				}
			}
			if (!lisatty) {
				hatut[h].add(x);
				pallot[h].add(1);
				eiTyhjia++;
			}
		}
    }
    
    int monessakoYksi() {
		return eiTyhjia;
    }
    
    int suurinMaara() {
		return suurin;
    }
}

/*
import java.util.*;

 

public class HatutJaPallot {

    HashMap<Integer,Integer> hatut = new HashMap<>();

    int suurin = 0;

    

    void lisaaPallo(int x) {

        if (!hatut.containsKey(x)) {

            hatut.put(x,0);

        }

        hatut.put(x,hatut.get(x)+1);

        suurin = Math.max(suurin,hatut.get(x));

    }

    

    int monessakoYksi() {

        return hatut.size();

    }

    

    int suurinMaara() {

        return suurin;

    }

}*/
