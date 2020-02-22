import java.util.*;

public class Kurssit {     
    static HashMap<String,Integer> kurssit; 
    static HashMap<Integer,String> tunnukset;
    static ArrayList<Integer>[] verkko;
    static ArrayList<Integer> kurssilista;
    static ArrayList<String> tuloslista;
    static int[] tila; //0=ei käyty, 1=kesken, 2=valmis
    static boolean sykli;

    public Kurssit(){
        int max=100;
        kurssit= new HashMap<>();
        tunnukset= new HashMap<>();
        kurssilista= new ArrayList<Integer>();
        verkko = new ArrayList[max+1];
        for (int i = 1; i <= max; i++) {
            verkko[i] = new ArrayList<>();
        }
        tila=new int[max+1];
        tuloslista = new ArrayList<String>();
        sykli=false;
    }

    static int haeTunnus(String nimi) {
        if (kurssit.containsKey(nimi)) {
            return kurssit.get(nimi);
        }
        kurssit.put(nimi,kurssit.size()+1);
        tunnukset.put(kurssit.size(),nimi);
        return kurssit.get(nimi);
    }
    
    public void lisaaKurssi(String s) {
        int tunnus=haeTunnus(s);
        kurssilista.add(tunnus);
    }

    public void lisaaVaatimus(String a, String b) {
        int tunnusA=kurssit.get(a);
        int tunnusB=kurssit.get(b);
        verkko[tunnusA].add(tunnusB);
    }
    
    public ArrayList<String> muodosta() {
        int solmu;
        for(int i=0;i<kurssilista.size();i++){
            solmu=kurssilista.get(i);
            syvyyshaku(solmu);
            if (sykli) break;
        }
        if (sykli) return null;
        if (tuloslista.size()==1) return null;
        ArrayList<String> apulista = new ArrayList<String>();
        for(int i=(tuloslista.size()-1);i>=0;i--){
            apulista.add(tuloslista.get(i));        //listan kääntö
        }
        return apulista;
    }

    static void syvyyshaku(int solmu) { //topologiseen järjestykseen, huom lisäksi vielä listan kääntö
        if (tila[solmu] == 2) return;
        if (tila[solmu] == 1){
            sykli=true;
            return;
        } 
        tila[solmu] = 1;
        for (int naapuri : verkko[solmu]) {
            syvyyshaku(naapuri);
        }
        tila[solmu]=2;
        tuloslista.add(tunnukset.get(solmu));
    }

}

/*
import java.util.*;


public class Kurssit {     */

    /*

        Ratkaisun ideana on valita joka askeleella seuraavaksi kurssi,

        jonka kaikki esitietokurssit on suoritettu.

    

        Jokaiselle kurssille on laskuri, joka kertoo, montako sitä edeltävää

        kurssia on vielä suorittamatta. Kun laskurin arvona on 0, kyseinen

        kurssi voidaan valita seuraavaksi suoritettavaksi.

    

        Kun kurssi suoritetaan, käydään läpi kaikki kurssit, joille se on

        esitietona, ja näiden kurssien laskureita vähennetään yhdellä.

    */

    

  /*  HashMap<String,Integer> laskurit = new HashMap<>();

    HashMap<String,ArrayList<String>> vaatimukset = new HashMap<>();

    

    public void lisaaKurssi(String s) {

        laskurit.put(s,0);

        vaatimukset.put(s,new ArrayList<>());

    }

 

    public void lisaaVaatimus(String a, String b) {

        laskurit.put(b,laskurit.get(b)+1);

        vaatimukset.get(a).add(b);

    }

    

    public ArrayList<String> muodosta() {

        ArrayList<String> tulos = new ArrayList<>();

        while (true) {

            boolean muutos = false;

            for (String a : laskurit.keySet()) {

                if (laskurit.get(a) == 0) {

                    for (String b : vaatimukset.get(a)) {

                        laskurit.put(b,laskurit.get(b)-1);

                    }

                    laskurit.remove(a);

                    tulos.add(a);

                    muutos = true;

                    break;

                }

            }

            if (!muutos) {

                return laskurit.isEmpty() ? tulos : null;

            }

        }

    }

 

}
*/