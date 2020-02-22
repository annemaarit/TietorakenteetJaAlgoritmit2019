public class PisinToisto {
    int laske(int[] t) {
		int pituus=t.length;
		int kpl=1;
		if (pituus==0){
			return 0;
		}else{
			if (pituus==1){
				return 1;
			}else{
				int apukpl=1;
				for(int i=0;i<pituus-1;i++){
					if (t[i]==t[i+1]){
						apukpl++;
					} else {
						if (apukpl>kpl){
							kpl=apukpl;
						}
						apukpl=1;
					}
				}
				if (apukpl>kpl){
					kpl=apukpl;
				}
				return kpl;
			}	
		}
    }
}

/*
public class PisinToisto {

    int laske(int[] t) {

        int n = t.length;

        int pisin = 1;

        int toisto = 1;

        for (int i = 1; i < n; i++) {

            if (t[i-1] == t[i]) toisto++;

            else toisto = 1;

            pisin = Math.max(pisin,toisto);

        }

        return pisin;

    }

}
*/