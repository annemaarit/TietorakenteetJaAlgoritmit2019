public class Lista {
    public int[] t=null;
	private int n=2;		//taulukon koko
	public int alku=0;
	public int loppu=n-1;
	private int loppuKpl=0;
	private int alkuKpl=0;

	
    void lisaaAlkuun(int x) {
		if (t==null){
			t=new int[n];
		}
		if (alku==loppu){
			kasvataTaulukkoa();
		}
		t[alku]=x;
		alku++;	
		alkuKpl++;
		/*System.out.println("Alkuun lisatty: "+x);
		for (int i : t) {
			System.out.print(i+" ");
		}
		System.out.println();*/
    }

    void lisaaLoppuun(int x) {	
		if (t==null){
			t=new int[n];
		}
		if (loppu==alku){
			kasvataTaulukkoa();
		}
		t[loppu]=x;
		loppu--;
		loppuKpl++;
		/*System.out.println("Loppuun lisatty: "+x);
		for (int i : t) {
			System.out.print(i+" ");
		}
		System.out.println();*/
    }

	private void kasvataTaulukkoa(){
		int ed=n;
		n=2*n;
		int[] apu = new int[n];
		for (int i = 0; i < alku; i++) {
			apu[i] = t[i];
		}
		
		int kpl=0;
		for (int j=ed-1; j>loppu;j--){
			apu[n-1-kpl]=t[j];
			kpl++;
		};
		
		loppu=n-kpl-1;
		t = apu;
	}

    int haeAlkio(int k) {
		if (k>(alkuKpl-1)){
			return t[(n-1)-(k-alkuKpl)];
		} else {
			return t[(alku-1)-k];
		}
    }   
}

/*
public class Lista {

    int[] t = new int[3000000];

    int a = 1500000;

    int b = 1500000;

    

    void lisaaAlkuun(int x) {

        t[--a] = x;

    }

 

    void lisaaLoppuun(int x) {

        t[b++] = x;

    }

 

    int haeAlkio(int k) {

        return t[a+k];

    }    

}
*/