import java.util.*;

public class Main {
    public static void main(String[] args) {
        Alijonot a = new Alijonot();
        System.out.println(a.laske(new int[] {1,1,1,1,1,1,1,1})); // 1
        System.out.println(a.laske(new int[] {1,2,3,4,1,2,3,4})); // 6
        System.out.println(a.laske(new int[] {6,2,3,5,2,4,1,8})); // 4
		
		Random r = new Random(1337);
        int[] t3 = new int[100];
        for (int i = 0; i < 100; i++) {		
			t3[i] = r.nextInt(10)+1;
		System.out.print(t3[i]+" ");
		}
		System.out.println("");
		System.out.println(a.laske(t3)); // 227
    }
}
