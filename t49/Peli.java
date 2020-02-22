import java.util.*;

public class Peli {  
	
    public int voittaja(int n) {
		
		int h=2*0+1;
		while (h<=n){
			if (h==n){
				return 2;
			}
			h=2*h+1;
		}
		
		return 1;
    }
	
}

/*
import java.util.*;

 

public class Peli {  

    public int voittaja(int n) {

        int k = 1;

        while (n+1 > k) k *= 2;

        return n+1 == k ? 2 : 1;

    }

}
*/