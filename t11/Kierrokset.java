public class Kierrokset {
    int laske(int[] t) {
		int kpl=t.length;
		int[] index = new int[kpl];
		int kierros=1;
		
		for (int i=0;i<kpl;i++){
			index[t[i]-1]=i;
			//System.out.println("Index"+(i)+": "+index[i]);
		}
		for (int k=0;k<kpl;k++){
			System.out.println("Index"+(k)+": "+index[k]);
		}
		
		for (int j=0;j<kpl-1;j++){
			if (index[j]>index[j+1]){
				kierros++;
			}
			//System.out.println("Index: "+j);
		}
		
		return kierros;
    }
}

/*
public class Kierrokset {

    int laske(int[] t) {

 

        // Ideana on luoda aputaulukko, jossa kohta[x] ilmaisee, missä kohdassa

        // luku x esiintyy taulukossa. Tämän muodostaminen vie aikaa O(n). Tämän

        // jälkeen käydään läpi luvut keräysjärjestyksessä. Aina jos kerättävä

        // luku esiintyy taulukossa aiemmin kuin viimeksi kerätty luku, täytyy

        // aloittaa uusi kierros.

 

        int n = t.length;

        int[] kohta = new int[n+1];

        for (int i = 0; i < n; i++) {

            kohta[t[i]] = i;

        }

        int tulos = 1;

        for (int i = 2; i <= n; i++) {

            if (kohta[i] < kohta[i-1]) tulos++;

        }

        return tulos;

    }

}
*/