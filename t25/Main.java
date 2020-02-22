import java.util.*;

public class Main {
    public static void main(String[] args) {
        HatutJaPallot h = new HatutJaPallot();
        /*h.lisaaPallo(2);
        h.lisaaPallo(3);
        h.lisaaPallo(5);*/
        System.out.println(h.monessakoYksi()); // 3
        System.out.println(h.suurinMaara()); // 1
        /*h.lisaaPallo(3);
        System.out.println(h.monessakoYksi()); // 3
        System.out.println(h.suurinMaara()); // 2*/
		
		/*h.lisaaPallo(1);
        h.lisaaPallo(1);
        h.lisaaPallo(1);
		System.out.println(h.monessakoYksi()); // 0
        System.out.println(h.suurinMaara()); // 3*/
		
		/*for (int i = 1; i <= 500000; i++) {
            h.lisaaPallo(1);
        }
		System.out.println(h.monessakoYksi()); // 1
        System.out.println(h.suurinMaara()); // 500000*/
		
		/*h.lisaaPallo(1);
        h.lisaaPallo(2);
        System.out.println(h.monessakoYksi()); //2
        System.out.println(h.suurinMaara());  //1
        h.lisaaPallo(1);
        h.lisaaPallo(2);
        System.out.println(h.monessakoYksi()); //2
        System.out.println(h.suurinMaara()); //2
        h.lisaaPallo(3);
        System.out.println(h.monessakoYksi()); //3
        System.out.println(h.suurinMaara());  //2*/
    }
}