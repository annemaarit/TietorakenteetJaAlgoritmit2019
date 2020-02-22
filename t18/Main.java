import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inversiot i = new Inversiot();
		int[] t = i.muodosta(3,3);
        System.out.println(Arrays.toString(t)); // [3,2,1]
        t = i.muodosta(5,10);
		System.out.println(Arrays.toString(t)); // [3, 4, 2, 5, 1]
        t = i.muodosta(5,2);
		System.out.println(Arrays.toString(t)); // [2, 1, 3, 5, 4]

    }
}