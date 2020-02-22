import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*LyhinReitti l = new LyhinReitti(5);
        l.lisaaTie(1,2,7);
        l.lisaaTie(2,4,2);
        l.lisaaTie(1,3,6);
        l.lisaaTie(3,4,5);
        l.lisaaTie(4,5,3);
        System.out.println(l.laske(1,5)); // 12*/
        LyhinReitti l = new LyhinReitti(9);
        l.lisaaTie(1,2,16);
        l.lisaaTie(1,4,7);
        l.lisaaTie(2,3,9);
        l.lisaaTie(3,5,8);
        l.lisaaTie(3,6,10);
        l.lisaaTie(4,5,5);
        l.lisaaTie(4,7,1);
        l.lisaaTie(5,9,50);
        l.lisaaTie(6,8,12);
        l.lisaaTie(7,9,95);
        l.lisaaTie(8,9,3);
		System.out.println(l.laske(1,9)); //45
    }
}

/*
import java.util.*;

 

public class LyhinReitti {  

    int n, m;

    int[] a = new int[200001];

    int[] b = new int[200001];

    int[] p = new int[200001];

    

    public LyhinReitti(int n) {

        this.n = n;

    }

    

    public void lisaaTie(int a, int b, int p) {

        m++;

        this.a[m] = a;

        this.b[m] = b;

        this.p[m] = p;

        m++;

        this.a[m] = b;

        this.b[m] = a;

        this.p[m] = p;

    }

    

    public int laske(int x, int y) {

        int[] matka = new int[n+1];

        int INF = 999999999;

        for (int i = 1; i <= n; i++) matka[i] = INF;

        matka[x] = 0;

        while (true) {

            boolean muutos = false;

            for (int i = 1; i <= m; i++) {

                if (matka[a[i]]+p[i] < matka[b[i]]) {

                    matka[b[i]] = matka[a[i]]+p[i];

                    muutos = true;

                }

            }

            if (!muutos) break;

        }

        return matka[y] == INF ? -1 : matka[y];

    }

}
*/