import java.util.*;

public class Main {
    public static void main(String[] args) {
        Polut p = new Polut();
        System.out.println(p.laske(1)); // 1
        System.out.println(p.laske(2)); // 2
        System.out.println(p.laske(3)); // 8
        System.out.println(p.laske(4)); // 52
		long alku = System.nanoTime();
			System.out.println(p.laske(7)); // 824
		long loppu = System.nanoTime();
		System.out.println("Aika: "+((loppu-alku)/1e9));
    }
}