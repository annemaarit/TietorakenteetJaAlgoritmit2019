import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mediaani2 m2 = new Mediaani2();
		Mediaani m = new Mediaani();
        /*for (int i = 1; i <= 20; i++) {
            m.lisaa(i);
            if (m.mediaani() != (i+1)/2) {
                System.out.println("Luokkasi antaa väärän mediaanin, kun on lisätty luvut 1-"+i+".");
            }else{
				System.out.println("ok");
			}
        }*/
		int n = 50;
        long s = 0;
		long s2 = 0;
		int luku=0;
		int laskuri=0;
        Random r = new Random(1337);
        for (int i = n; i >= 1; i--) {
			luku=r.nextInt(1000)+1;
			laskuri++;
			System.out.println("luku: "+luku);
            m.lisaa(luku);
			m2.lisaa(luku);
			System.out.println("m:  "+m.mediaani());
			System.out.println("m2: "+m2.mediaani());
            s += m.mediaani();
			s2 += m2.mediaani();
			if (s!=s2){
				System.out.println("Virhe alkiossa nro: "+laskuri);
			}
			System.out.println("");
        }
        System.out.println("S:  "+Long.toString(s)); //499560941004861L
		System.out.println("S2: "+Long.toString(s2));
		/*int n = 5;
        Random r = new Random(1337);
        for (int i = n; i >= 1; i--) {
			int l=r.nextInt(1000000000)+1;
            m.lisaa(l);
			System.out.println("Lisatty: "+l);
            System.out.println("Mediaani: "+m.mediaani());
			System.out.println("");
        }*/
        /*m.lisaa(3);
        System.out.println(m.mediaani()); // 3
        m.lisaa(1);
        System.out.println(m.mediaani()); // 1
        m.lisaa(4);
        System.out.println(m.mediaani()); // 3
        m.lisaa(7);
        System.out.println(m.mediaani()); // 3
        m.lisaa(1);
        System.out.println(m.mediaani()); // 3*/
    }
}