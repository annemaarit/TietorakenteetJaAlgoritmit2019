import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ruudukko r = new Ruudukko();
        /*int[][] t = {{2,3,1},
                     {1,4,5},
                     {2,3,4}};
		System.out.println(r.laske(t)); // 18*/
		/*int[][] t = {{2,3,1,4,6},
                     {1,4,5,6,7},
                     {2,5,4,8,8},
					 {2,3,4,8,1},
					 {2,3,4,8,1}};
        System.out.println(r.laske(t)); // 45*/ 
		
        int n = 100;
        int[][] t = new int[n][n];
        Random ra = new Random(1337);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = ra.nextInt(10)+1;
				if (t[i][j]<10){
					System.out.print(" "+t[i][j]+" ");
				}else{
					System.out.print(t[i][j]+" "); 
				}
            }
			System.out.println("");
        }
		System.out.println("--------------");
		System.out.println(r.laske(t)); //1545
    }
}