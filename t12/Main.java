import java.util.*;

public class Main {
    public static void main(String[] args) {
        Alitaulukot a = new Alitaulukot();
        System.out.println(a.laske(new int[] {1,2,1,3,2})); // 10 5+4+1
        System.out.println(a.laske(new int[] {1,1,1,1,1})); // 15
        System.out.println(a.laske(new int[] {1,2,3,4,5})); // 9  5+4  
		System.out.println(a.laske(new int[] {1,2,2,2,3,2,2,1})); // 8+7+6+4+2+1=28
		System.out.println(a.laske(new int[] {1,2,3,2,2,1})); // 6+5+3+1=15
		System.out.println(a.laske(new int[] {1,2,3,2,4})); // 5+4+1=10
		//System.out.println(a.laske(new int[] {1,2,2,2,3,2,2,1})); // 8+7+6+4+2+1=28
		System.out.println(a.laske(new int[] {1,2,2,4,3,2,1})); // 7+6+2=15

		
		/*int n = 1000000;
		Random r = new Random(1337);
        int[] t3 = new int[n];
        for (int i = 0; i < n; i++) {
            if (r.nextInt(10000) == 0) {
                t3[i] = 3;
            } else {
                t3[i] = r.nextInt(2)+1;
            }
        }
		
		
		int[] t4 = new int[n];
        int ab = 1, b = 2;
        for (int i = 0; i < n; i++) {
            int z = r.nextInt(10000);
            if (i == 0 || z == 0) {
                ab = r.nextInt(1000000)+1;
            }
            if (i == 0 || z == 1) {
                b = r.nextInt(1000000)+1;
            }
            t4[i] = r.nextInt(2) == 0 ? ab : b;
        }
		System.out.println(a.laske(t3)); // 11048749797L 
		System.out.println(a.laske(t4)); // 4688866726L*/
    }
}