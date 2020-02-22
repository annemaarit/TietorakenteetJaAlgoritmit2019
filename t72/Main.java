import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Polkupeite p = new Polkupeite(5);
        p.lisaaKaari(1,2);
        p.lisaaKaari(2,3);
        p.lisaaKaari(3,4);
        p.lisaaKaari(5,2);
        p.lisaaKaari(5,3);
        p.tulostaMatriisi();
        */
        /*Polkupeite p = new Polkupeite(6);
        p.lisaaKaari(1,2);
        p.lisaaKaari(2,3);
        p.lisaaKaari(3,4);
        p.lisaaKaari(5,6);

        Polkupeite p = new Polkupeite(8);
        p.lisaaKaari(1,2);
        p.lisaaKaari(1,3);
        p.lisaaKaari(2,5);
        p.lisaaKaari(3,4);
        p.lisaaKaari(3,7);
        p.lisaaKaari(4,6);
        p.lisaaKaari(4,7);
        p.lisaaKaari(4,8);
        p.lisaaKaari(5,3);
        p.lisaaKaari(5,4);
        p.lisaaKaari(5,6);
        p.lisaaKaari(6,8);
        p.lisaaKaari(7,8);
        p.tulostaMatriisi();*/

        Polkupeite p = new Polkupeite(100);
        Random r = new Random(1337);
        for (int i = 1; i <= 200; i++) {
            int a = r.nextInt(100-1)+1;
            int b = a+r.nextInt(100-a)+1;
            p.lisaaKaari(a,b);
            System.out.println("Kaari: "+a+" "+b);
        }
        
        System.out.println(p.muodosta()); // [1->2, 5->3->4]
    }
}