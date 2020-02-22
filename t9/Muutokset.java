public class Muutokset {
    int laske(int[] t) {
		int pituus=t.length;
		int kpl=0;
		if (pituus>1){
			for(int i=0;i<(pituus-1);i++){
				if (t[i]==t[i+1]){
					kpl++;
					if ((i+2)<(pituus)){
						if ((t[i+1]+1)==(t[i+2])){
							t[i+1]=t[i+2]+1;
						} else {
							t[i+1]+=1;
						}
					} else {
						t[i+1]+=1;
					}
				}
				//System.out.print(t[i]);
			}
		}
		/*for(int i=0;i<pituus;i++){
			System.out.print(t[i]+" ");
		}*/
		return kpl;
    }
}

/*
public class Muutokset {

    int laske(int[] t) {

        int n = t.length;

        int tulos = 0;

        for (int i = 1; i < n; i++) {

            if (t[i-1] == t[i]) {

                tulos++;

                i++;

            }

        }

        return tulos;

    }

}
*/