import java.util.*;

public class Merkkijonot {  
	static ArrayList<String>merkit;
    
    public ArrayList<String> muodosta(int n) {
		merkit = new ArrayList<String>();
		lisaaListaan(n,"A");
		lisaaListaan(n,"B");
		return merkit;
    }
	
	private void lisaaListaan(int n, String s){
		if(n==1){
			merkit.add(s);
			return;
		}
		n--;
		lisaaListaan(n,s+"A");
		lisaaListaan(n,s+"B");
	}
}

/*
import java.util.*;

 

public class Merkkijonot {  

    ArrayList<String> jonot;

    

    void haku(String s, int n) {

        if (s.length() == n) {

            jonot.add(s);

        } else {

            haku(s+"A",n);

            haku(s+"B",n);

        }

    }

    

    public ArrayList<String> muodosta(int n) {

        jonot = new ArrayList<>();

        haku("",n);

        return jonot;

    }

}
*/