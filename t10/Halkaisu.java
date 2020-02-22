public class Halkaisu {
    int laske(int[] t) {
		int kpl=0;
		int pituus=t.length;
		int summa=0;
		int summa1=0;
		int summa2=0;
		int j=0;
		
		for (int luku:t){
			summa+=luku;
		}
		
		for (int i=0; i<pituus-1; i++){
			summa1+=t[i];
			System.out.println("summa1: "+summa1);
			summa2=summa-summa1;
			System.out.println("summa2: "+summa2);
			if (summa1==summa2){
				kpl++;
			}
			summa2=0;
		}
		return kpl;
    }
}

/*
public class Halkaisu {

    int laske(int[] t) {

        int n = t.length;

        int summa = 0;

        for (int i = 0; i < n; i++) {

            summa += t[i];

        }

        int tulos = 0;

        int uusi = 0;

        for (int i = 0; i < n-1; i++) {

            uusi += t[i];

            if (2*uusi == summa) tulos++;

        }

        return tulos;

    }

}
*/