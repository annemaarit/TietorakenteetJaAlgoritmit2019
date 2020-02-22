import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*int n = 10;
        int[] t2 = new int[n];
        Random r = new Random(1337);
        for (int i = 0; i < n; i++) {
            t2[i] = r.nextInt(2)+1;
			System.out.print(t2[i]+" ");
        }
		System.out.println();*/
		
		
        Poistot p = new Poistot();
		//System.out.println(p.laske(t2)); // 2
		System.out.println(p.laske(new int[] {1,2,2,2,1,1,2})); // 1
        System.out.println(p.laske(new int[] {1,2,2,3})); // 2
        System.out.println(p.laske(new int[] {1,2,3,4})); // 4
        System.out.println(p.laske(new int[] {1,2,2,3,3,1})); // 0*/
    }
}