import java.util.*;

public class Suunnat {     
    ArrayDeque<Kaari> kaaret;
    
    public Suunnat(int n) {
        kaaret = new ArrayDeque<>();
    }

    public void lisaaKaari(int a, int b) {
        Kaari k = new Kaari(a,b);
        kaaret.addLast(k);
    }
    
    public ArrayList<Kaari> muodosta() {
        

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