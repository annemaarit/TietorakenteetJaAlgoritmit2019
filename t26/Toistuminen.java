import java.util.*;

public class Toistuminen {
	HashMap<Integer,Integer>sijainti=new HashMap<>();
	int paikka=0;
    
    int uusiLuku(int x) {
		int erotus=-1;
		if (!sijainti.containsKey(x)){
				sijainti.put(x,paikka);
		}else{
			int edellinen=sijainti.get(x);
			erotus=paikka-edellinen-1;
			sijainti.put(x,paikka);
		}
		paikka++;
		return erotus;
    }
}

/*
import java.util.*;

 

public class Toistuminen {

    HashMap<Integer,Integer> hatut = new HashMap<>();

    int laskuri = 0;

    

    int uusiLuku(int x) {

        laskuri++;

        int vanha = hatut.containsKey(x) ? hatut.get(x) : laskuri;

        hatut.put(x,laskuri);

        return laskuri-vanha-1;

    }

}*/
