import java.util.*;

public class Main {
    public static void main(String[] args) {
        Yhtenaisyys a = new Yhtenaisyys(3);
        a.lisaaKaari(1,2);
        a.lisaaKaari(2,3);
        a.lisaaKaari(3,1);
        System.out.println(a.tutki()); // true
        Yhtenaisyys b = new Yhtenaisyys(3);
        b.lisaaKaari(1,2);
        b.lisaaKaari(2,3);
        b.lisaaKaari(1,3);
        System.out.println(b.tutki()); // false

        int n = 100;
        Yhtenaisyys y = new Yhtenaisyys(n);
        Random r = new Random(1337);
        int m = 451;
        for (int i = 1; i <= m; i++) {
            int a1 = r.nextInt(n)+1;
            int b1 = r.nextInt(n)+1;
            y.lisaaKaari(a1,b1);
        }
        System.out.println(b.tutki()); // false

        n = 100;
        y = new Yhtenaisyys(n);
        System.out.println(b.tutki()); // false

        n = 100;
        y = new Yhtenaisyys(n);
        m = 100000;
        for (int i = 1; i <= m; i++) {
            int a2 = r.nextInt(n-1)+1;
            int b2 = r.nextInt(n-1)+1;
            y.lisaaKaari(a2,b2);
        }
        System.out.println(b.tutki()); // false
    }
}