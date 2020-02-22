public class Onnenluvut {
    int laske(int a, int b) {
		int tulos=0;
		if (a==b){
			tulos=laskeNollasta(a);
		} else {
			int kaikki=laskeNollasta(b);
			int poista=laskeNollasta(a);
			//System.out.println("kaikki: "+kaikki);
			//System.out.println("poista: "+poista);
			tulos=kaikki-poista;
		}
		return tulos;
    }
	
	int laskeNollasta(int luku) {
		int n=0;	
		int kpl=0;
		int eka=0;
		int apuluku=luku;
		while (apuluku!=0){
			n++;
			kpl+=Math.pow(2,n); 
			eka=apuluku%10;
			apuluku/=10;
		}
		
		if (eka<3){
			return (kpl-=Math.pow(2,n));
		} else {
			if (eka>7){
				return kpl;
			} else {
				if ((eka>3)&&(eka<7)){
					return (kpl-=Math.pow(2,n-1));
				} else { //joko 3 tai 7
					kpl-=Math.pow(2,n);
					return kpl+laskeKpl(eka,n,luku);
				}
			}
		}
    }
	
	int laskeKpl(int eka,int n, int luku){
		int kpl=0;
		int k=n-1;
		int alku=0;
		
		if (eka==3){
			while (k>=0){
				alku+=3*(int) Math.pow(10,k);
				k--;
			}
		}else{
			alku+=7*(int) Math.pow(10,k);
			kpl=(int) Math.pow(2,n-1);
			k--;
			while (k>=0){
				alku+=3*(int) Math.pow(10,k);
				k--;
			}
		}
		
		int apu=0;
		int nro=0;
		boolean ok=false;
		//System.out.println("alku: "+alku);
		for (int i=alku; i<=luku; i++){
			apu=i;
			while (apu!=0){
				nro=apu%10;
				if ((nro==3)||(nro==7)){
					ok=true;
				}else{
					ok=false;
					break;
				}
				apu/=10;
			}
			if (ok){
				kpl++;
			}
			ok=false;
		}
		//System.out.println("kpl: "+kpl);
		if (alku>=733333333){kpl++;}
		return kpl;
	}
}
/*
public class Onnenluvut {

    int laske(int a, int b) {

 

        // Tehokas ratkaisu perustuu havaintoon, että numeroista 3 ja 7 muodostuvia

        // lukuja välillä 1...10^9 on yhteensä melko pieni määrä (vähän yli 1000),

        // eli voimme muodostaa kaikki tällaiset luvut ja käydä ne läpi.

        //

        // Seuraava koodi muodostaa taulukkoon listan

        //

        // [3,7,33,37,73,77,333,337,373,377,...]

        //

        // laittamalla taulukkoon ensin luvut 3 ja 7 ja käymällä sitä sitten läpi

        // vasemmalta oikealle. Joka luvun kohdalla koodi tarkastaa, osuuko se

        // välille a...b, ja kasvattaa laskuria, jos näin käy. Tämän jälkeen koodi

        // muodostaa kaksi uutta lukua, joissa nykyisen luvun perään on laitettu

        // 3 ja 7. Esimerkiksi luvusta 73 syntyy luvut 733 ja 737. Silmukka jatkuu,

        // kunnes on käyty läpi kaikki luvut väliltä 1...10^9.

 

        int tulos = 0;

        int[] luvut = new int[1024];

        luvut[0] = 3;

        luvut[1] = 7;

        int maara = 2;

        for (int i = 0; i < maara; i++) {

            if (a <= luvut[i] && luvut[i] <= b) {

                tulos++;

            }

            if (luvut[i] < 1e8) {

                luvut[maara++] = luvut[i]*10+3;

                luvut[maara++] = luvut[i]*10+7;

            }

        }

        return tulos;

    }

}
*/