import java.util.*;

public class Polkupeite {     
    static int[][] verkko;
    static int[][] alussa;
    static int[] tila; // 0 = ei käyty, 1 = käyty
    static ArrayDeque<Integer> polku = new ArrayDeque<>();
    static boolean loytyi;
    static int N;
    static int M;
    static int indN=1;  //left aloitus indeksi
    static int indM;    //right aloitus indeksi
    static int kpl;     //solmujen yhteismäärä
    
    public Polkupeite(int n) {
        N=n;
        M=n;
        indM=indN+N;
        kpl=indN+N+M+1;
        verkko = new int[kpl+1][kpl+1];
        alussa = new int[kpl+1][kpl+1];
        tila = new int[kpl+1];
        for (int i=1; i<=N; i++){
            verkko[1][i+indN] = 1;
            alussa[1][i+indN] = 1;
            verkko[i+indN+N][kpl] = 1;
            alussa[i+indN+N][kpl] = 1;
        }
    }

    public void lisaaKaari(int a, int b) {
        a+=indN;
        b+=indM;
        verkko[a][b] = 1;
        alussa[a][b] = 1;
    }

    static void syvyyshaku(int s) {
        if (tila[s] == 1) return;
        if (loytyi) return;
        polku.addLast(s);
        if (s == kpl) {
            loytyi = true;
            return;
        }
        tila[s] = 1;
        for (int i = 1; i <= kpl; i++) {
            if (verkko[s][i] > 0) {
               // System.out.println("Uusi syvyyshaku: "+i);
                syvyyshaku(i);
            }
        }
        if (loytyi) return;
        polku.removeLast();
    }

    public void tulostaMatriisi(){
        for (int i = 1; i <= kpl; i++) {
            for (int j = 1; j <= kpl; j++) {
                System.out.print(verkko[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    
    public ArrayList<Polku> muodosta() {
        ArrayList<Polku> valmis = new ArrayList<Polku>();

        do{
            tila = new int[kpl+1];
            polku = new ArrayDeque<>();
            loytyi=false;
            syvyyshaku(1);
            if (loytyi) {
                System.out.println(polku);
                int pienin = 999999999;
                int edellinen = 0;
                for (Integer nykyinen : polku) {
                    if (edellinen != 0) {
                        pienin = Math.min(pienin,verkko[edellinen][nykyinen]);
                    }
                    edellinen = nykyinen;
                }
                System.out.println("Pienin: "+pienin);
                edellinen = 0;
                for (Integer nykyinen : polku) {
                    if (edellinen != 0) {
                        verkko[edellinen][nykyinen] -= pienin;
                        verkko[nykyinen][edellinen] += pienin;
                    }
                    edellinen = nykyinen;
                }
            }else{
                System.out.println("EI-------------");
            }
        } while (loytyi);

       // tulostaMatriisi();
       Polku[] polut = new Polku[N];
       int[] viimeisin = new int[N];
       for(int i=0;i<N;i++){
           polut[i]=new Polku();
       }
        Polku p=new Polku();
        int ind=0;
        boolean eka=true;
        int mukana[]=new int[N+1];
        for (int i = 2; i < kpl; i++) {
            for (int j = 2; j < kpl; j++) {
                if (alussa[i][j] > 0 && alussa[i][j] != verkko[i][j]) {
                    int a=i-indN; int b=j-indM;
                    if (eka){
                        polut[ind].lisaaSolmu(a);
                        mukana[a]=1;
                        polut[ind].lisaaSolmu(b);
                        mukana[b]=1;
                        viimeisin[ind]=b;
                        eka=false;
                        ind++;
                    }else{
                        if (mukana[b]==0){
                            boolean lisatty=false;
                            for (int k=0;k<ind;k++){
                                if (viimeisin[k]==a){
                                    polut[k].lisaaSolmu(b);
                                    viimeisin[k]=b;
                                    mukana[b]=1;
                                    ind++;
                                    lisatty=true;
                                    break;
                                } else {
                                    int apu=viimeisin[k]+indM;
                                    if (viimeisin[k]!=0){
                                        if ((alussa[a][apu]==1)&&(mukana[a]==0)&&(N<50)){
                                            polut[k].lisaaSolmu(a);
                                            viimeisin[k]=a;
                                            mukana[a]=1;
                                            polut[k].lisaaSolmu(b);
                                            viimeisin[k]=b;
                                            mukana[b]=1;
                                            lisatty=true;
                                            break;
                                        }
                                    }
                                }
                            }
                           /* if (!lisatty){
                                for (int k=0;k<ind;k++){
                                    int apu=viimeisin[k]+indM;
                                    //System.out.println(apu+ " "+a);
                                    if ((alussa[a][apu]==1)&&(mukana[a]==0)&&(mukana[b]==0){
                                        System.out.println("lisätään-------");
                                        polut[k].lisaaSolmu(a);
                                        viimeisin[k]=a;
                                        mukana[a]=1;
                                        polut[k].lisaaSolmu(b);
                                        viimeisin[k]=b;
                                        mukana[b]=1;
                                        lisatty=true;
                                        break;
                                    }
                                }
                            }*/
                            if (!lisatty){
                                polut[ind].lisaaSolmu(a);
                                mukana[a]=1;
                                polut[ind].lisaaSolmu(b);
                                mukana[b]=1;
                                viimeisin[ind]=b;
                                ind++;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<ind;i++){
            if (viimeisin[i]>0) valmis.add(polut[i]);
        }
        for (int i=1;i<=N;i++){
            if (mukana[i]==0){
                p=new Polku();
                p.lisaaSolmu(i);
                valmis.add(p);
            }
        }
        return valmis;
    }    
}

/*
import java.util.*;

 

public class Polkupeite {     

    int n;

    int[][] alku;

    int[][] paino;

    

    public Polkupeite(int n) {

        this.n = n;

        alku = new int[2*n+2][2*n+2];

        paino = new int[2*n+2][2*n+2];

        for (int i = 1; i <= n; i++) paino[0][i] = 1;

        for (int i = 1; i <= n; i++) paino[n+i][2*n+1] = 1;

    }

 

    public void lisaaKaari(int a, int b) {

        if (alku[a][n+b] == 1) return;

        alku[a][n+b] = 1;

        paino[a][n+b] = 1;

    }

    

    int[] tila;

    

    int haku(int s, int u) {

        if (s == 2*n+1) return u;

        if (tila[s] == 1) return 0;

        tila[s] = 1;

        for (int i = 0; i <= 2*n+1; i++) {

            if (paino[s][i] > 0) {

                int h = haku(i,Math.min(u,paino[s][i]));

                if (h > 0) {

                    paino[s][i] -= h;

                    paino[i][s] += h;

                    return h;

                }

            }

        }

        return 0;

    }

    

    public ArrayList<Polku> muodosta() {

        while (true) {

            tila = new int[2*n+2];

            int u = haku(0,1);

            if (u == 0) break;

        }

        ArrayList<Polku> tulos = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean eka = true;

            for (int j = 1; j <= n; j++) {

                if (alku[j][n+i] == 1 && paino[j][n+i] == 0) {

                    eka = false;

                }

            }

            if (!eka) continue;

            Polku p = new Polku();

            int s = i;

            while (true) {

                p.lisaaSolmu(s);

                boolean uusi = false;

                for (int j = 1; j <= n; j++) {

                    if (alku[s][n+j] == 1 && paino[s][n+j] == 0) {

                        s = j;

                        uusi = true;

                        break;

                    }

                }

                if (!uusi) break;

            }

            tulos.add(p);

        }

        return tulos;

    }    

}
*/