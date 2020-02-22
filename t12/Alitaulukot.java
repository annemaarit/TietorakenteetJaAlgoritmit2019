public class Alitaulukot {
    long laske(int[] t) {
		int pituus=t.length;
		if (pituus>1){
			int[] jonot=new int[pituus+1];
			for (int j=0;j<pituus+1;j++){
				jonot[j]=0;
			};
		
			int nro1=t[0];
			int ind1=0;
			int nro2=t[1];
			int kpl=1;
			int jonoKpl=0;
			int edellinen=nro1;
			long yht=3;

			
			if (nro1==nro2){
				kpl=2;
			}else{
				kpl=1;
			}
			
			for (int i=2;i<pituus;i++){
				edellinen=t[i-1];
				if ((t[i]==nro1)||(t[i]==nro2)){
					if (t[i]==edellinen){
						kpl++;
					}else{
						kpl=1;
					};
				}else{
					nro2=t[i];					
					nro1=t[i-kpl];
					ind1=i-kpl;
					kpl=1;

				};	

					jonoKpl=(i+1)-ind1;
					yht+=jonoKpl;


			};	
			return yht;
		}else{
			return 1;
		}
    }
}

/*
public class Alitaulukot {

    long laske(int[] t) {

 

        // Koodissa on ideana käydä taulukko läpi vasemmalta oikealle ja laskea

        // joka kohdassa kaikki sallitut alitaulukot, joiden viimeinen luku on

        // kyseisessä kohdassa. Tämä onnistuu muistamalla, missä kohdissa ovat olleet

        // kolme viimeksi esiintynyttä eri alkiota taulukossa (kohta1, kohta2 ja

        // kohta3). Joka kohdassa alitaulukon tulee alkaa kohdan kohta3 jälkeen.

 

        int n = t.length;

        int kohta1 = -1, kohta2 = -1, kohta3 = -1;

        long tulos = 0;

        for (int i = 0; i < n; i++) {

            int x = t[i];

            if (kohta1 >= 0 && t[kohta1] == x) {

                kohta1 = i;

            } else if (kohta2 >= 0 && t[kohta2] == x) {

                kohta2 = kohta1;

                kohta1 = i;

            } else {

                kohta3 = kohta2;

                kohta2 = kohta1;

                kohta1 = i;

            }

            tulos += i-kohta3;

        }

        return tulos;

    }

}*/