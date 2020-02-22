import java.util.*;

public class Merkkijonot {  
    static ArrayList<String>merkit;
	
    public ArrayList<String> muodosta(int n, int k) {
		merkit = new ArrayList<String>();
		char m=65;
		String M = Character.toString(m);
		for (int i=0;i<k;i++){
			lisaaListaan(n,M,k);
			m++;
			M = Character.toString(m);
		}
		return merkit;
    }
	
	private void lisaaListaan(int n, String s,int k){
		if(n==1){
			merkit.add(s);
			return;
		}
		n--;
		char m=65;
		String M = Character.toString(m);
		for (int i=0;i<k;i++){
			lisaaListaan(n,s+M,k);
			m++;
			M = Character.toString(m);
		}
	}
}

/*
import java.util.*;

 

public class Merkkijonot {  

    ArrayList<String> jonot;

    

    void haku(String s, int n, int k) {

        if (s.length() == n) {

            jonot.add(s);

        } else {

            for (int i = 0; i < k; i++) {

                haku(s+(char)('A'+i),n,k);

            }

        }

    }

    

    public ArrayList<String> muodosta(int n, int k) {

        jonot = new ArrayList<>();

        haku("",n,k);

        return jonot;

    }

}
*/