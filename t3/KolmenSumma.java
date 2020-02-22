public class KolmenSumma {
    int laske(int x) {
		int kpl=0;
		for (int i=1; i<(x-2);i++){
				for (int j=i+1; j<x-(i+j);j++){
					kpl++;
				}		
		}
		return kpl;
    }
}

/*
public class KolmenSumma {

    int laske(int x) {

        int tulos = 0;

        for (int a = 1; a <= x; a++) {

            for (int b = a+1; b <= x; b++) {

                for (int c = b+1; c <= x; c++) {

                    if (a+b+c == x) tulos++;

                }

            }

        }

        return tulos;

    }

}
*/