import java.util.*;

public class Main {
    public static void main(String[] args) {
        Viestinta v = new Viestinta(6);
        v.lisaaYhteys(1,2);
        v.lisaaYhteys(2,3);
        v.lisaaYhteys(1,3);
        v.lisaaYhteys(3,4);
        v.lisaaYhteys(5,6);
		/*v.lisaaYhteys(1,2);
		v.lisaaYhteys(2,3);
		v.lisaaYhteys(3,4);
		v.lisaaYhteys(4,5);
		v.lisaaYhteys(5,6);*/
        /*int n = 5000;
        int m = 100000;
        Viestinta v = new Viestinta(n);
        for (int i = 1; i+1 <= n; i++) v.lisaaYhteys(i,i+1);
        for (int i = 1; i <= m; i++) {
            if (!v.tarkasta(1,n)) fail("Luokkasi toimii väärin, kun koneet muodostavat ketjun");
        }		*/
		
        System.out.println(v.tarkasta(1,4)); // true
        System.out.println(v.tarkasta(2,5)); // false
        System.out.println(v.tarkasta(5,6)); // true
    }
}