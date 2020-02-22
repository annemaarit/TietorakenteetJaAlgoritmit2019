import java.util.*;

public class VainYksi {
    int etsi(int[] t) {
		Arrays.sort(t);
		boolean vaihto=false;
		int yksin=t[0];
		if (t.length>1){
			int kpl=1;
			for (int i=0;i<t.length-1;i++){
				if (vaihto){
					vaihto=false;
					yksin=t[i+1];
				} else {
					if (t[i]==t[i+1]){
						vaihto=true;
					}else {
						return t[i];
					}
				}
			}
		}
		return yksin;
    }
}

/*
import java.util.*;

 

public class VainYksi {

    int etsi(int[] t) {

        Arrays.sort(t);

        int n = t.length;

        for (int i = 0; i+1 < n; i += 2) {

            if (t[i] != t[i+1]) return t[i];

        }

        return t[n-1];

    }

}
*/