import java.util.*;

public class Main {
    public static void main(String[] args) {
        Komponentit k = new Komponentit(5);
        System.out.println(k.laske()); // 5
        k.yhdista(1,2);
        k.yhdista(2,3);
        System.out.println(k.laske()); // 3
        k.yhdista(1,3);
        System.out.println(k.laske()); // 3
        k.yhdista(4,5);
        System.out.println(k.laske()); // 2
        /*
        Komponentit k = new Komponentit(5);
        System.out.println(k.laske()); // 5
        k.yhdista(1,2);
        System.out.println(k.laske()); // 4
        k.yhdista(3,4);
        System.out.println(k.laske()); // 3
        k.yhdista(3,5);
        System.out.println(k.laske()); // 2
        k.yhdista(1,5);
        System.out.println(k.laske()); // 1
        */
    }
}