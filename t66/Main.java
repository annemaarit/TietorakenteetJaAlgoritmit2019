import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Ruudukko r = new Ruudukko(4);
        System.out.println(r.laskeHuoneet()); // 0
        r.teeLattia(1,1);
        r.teeLattia(1,3);
        System.out.println(r.laskeHuoneet()); // 2
        r.teeLattia(1,2);
        System.out.println(r.laskeHuoneet()); // 1
        r.teeLattia(3,3);
        System.out.println(r.laskeHuoneet()); // 2

        Ruudukko r = new Ruudukko(2);
        System.out.println(r.laskeHuoneet()); // 0
        r.teeLattia(1,1);
        System.out.println(r.laskeHuoneet()); // 1
        r.teeLattia(2,2);
        System.out.println(r.laskeHuoneet()); // 2
        r.teeLattia(1,2);
        System.out.println(r.laskeHuoneet()); // 1
        r.teeLattia(2,1);
        System.out.println(r.laskeHuoneet()); // 1*/

        Ruudukko r = new Ruudukko(1);
        r.teeLattia(1,1);
        System.out.println(r.laskeHuoneet()); // 1
        r.teeLattia(1,1);
        System.out.println(r.laskeHuoneet()); // 1
    }
}