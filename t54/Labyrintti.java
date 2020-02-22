import java.util.*;

public class Labyrintti {  
	//static String tulos=null;
	
	public class Solu{
		private int x;
		private int y;
		private char merkki;
		
		public Solu(int x, int y, char m){
			this.x=x;
			this.y=y;
			this.merkki=m;
		}
		
		public int getx(){
			return this.x;
		}
		
		public int gety(){
			return this.y;
		}
		
		public char getm(){
			return this.merkki;
		}
	}
	
    public String etsi(char[][] laby) {
		int n=laby.length;
		int m=laby[1].length;
		String tulos=null;
		
		ArrayDeque<Solu> jono=new ArrayDeque<>();
		boolean[][] vierailtu = new boolean[n+1][m+1];
		String[][] polku = new String[n+1][m+1];
		
		int alkuX=1;
		int alkuY=1;
		if (laby[1][1]!='x'){
			for(int i=1;i<n;i++){
				for(int j=1;j<m;j++){
					if (laby[i][j]=='x'){
						alkuX=i;
						alkuY=j;
						break;
					}
				}
				if (alkuX!=1) break;
			}
		}

		Solu solu;
		Solu alku=new Solu(alkuX,alkuY,'x');
		jono.addLast(alku);
		vierailtu[alkuX][alkuY]=true;
		int i;
		int j;
		int solux;
		int soluy;
		char suunta;
		while (!jono.isEmpty()){
			solu=jono.getFirst();
			jono.removeFirst();
			solux=solu.getx();
			soluy=solu.gety();
			//System.out.println("Tutkitaan solun i: "+solux+" j: "+soluy+" naapurit.");
			for (int ind = 1; ind <= 4; ind++) {
				switch(ind) {
				  case 1:
						i=solux-1;
						j=soluy;
						suunta='Y';
					break;
				  case 2:
						i=solux+1;
						j=soluy;
						suunta='A';
					break;
				  case 3:
						i=solux;
						j=soluy-1;
						suunta='V';
					break;
				  case 4:
						i=solux;
						j=soluy+1;
						suunta='O';
					break;
				  default:
						i=solux;
						j=soluy;
						suunta='Q';
				}
				if (laby[i][j]=='y'){
					//System.out.println(suunta);
					
					if (polku[solux][soluy]==null){
						polku[solux][soluy]=Character.toString(suunta);
					}else{
						polku[solux][soluy]=polku[solux][soluy]+Character.toString(suunta);
					}
					//System.out.println("Löytyi; "+polku[solux][soluy]);
					tulos=polku[solux][soluy];
					jono.clear();
					break;
				}
				if ((vierailtu[i][j]!=true)&&(laby[i][j]!='#')){
					jono.addLast(new Solu(i,j,laby[i][j]));
					//System.out.println("Lisätty jonoon solu i: "+i+" j: "+j);
					//System.out.println("Lisätty "+laby[i][j]);
					vierailtu[i][j]=true;
					if (polku[solux][soluy]==null){
						polku[i][j]=Character.toString(suunta);
					}else{
						polku[i][j]=polku[solux][soluy]+Character.toString(suunta);
					}
					
					//System.out.print(suunta);
					//System.out.println("i: "+i+" j: "+j+" "+laby[i][j]);
					/*System.out.println();
					for (int it = 0; it < laby.length; it++) {
						for (int jt = 0; jt < laby[0].length; jt++) {
							if (it == i && jt == j) {
								System.out.print('@');
							} else {
								System.out.print(laby[it][jt]);
							}
						}
						System.out.println();
					}*/
				}
			}
			
		}		
		return tulos;
    }
	
}

/*
import java.util.*;

 

public class Labyrintti {  

    public String etsi(char[][] laby) {

        int n = laby.length;

        int m = laby[0].length;

        int ay = 0, ax = 0, by = 0, bx = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (laby[i][j] == 'x') {ay = i; ax = j;}

                if (laby[i][j] == 'y') {by = i; bx = j;}

            }

        }

        // matka, tulosuunta, vanha y, vanha x

        int[][][] tiedot = new int[n][m][4];

        tiedot[ay][ax][0] = 1;

        ArrayList<Integer> jono = new ArrayList<>();

        jono.add(ay*100+ax);

        int[][] suunta = {{-1,0},{1,0},{0,-1},{0,1}};

        char[] merkki = {'Y','A','V','O'};

        for (int i = 0; i < jono.size(); i++) {

            int cy = jono.get(i)/100;

            int cx = jono.get(i)%100;

            for (int j = 0; j < 4; j++) {

                int uy = cy+suunta[j][0];

                int ux = cx+suunta[j][1];

                if (tiedot[uy][ux][0] == 0 && laby[uy][ux] != '#') {

                    tiedot[uy][ux][0] = tiedot[cy][cx][0]+1;

                    tiedot[uy][ux][1] = j;

                    tiedot[uy][ux][2] = cy;

                    tiedot[uy][ux][3] = cx;

                    jono.add(uy*100+ux);

                }

            }

        }

        if (tiedot[by][bx][0] == 0) return null;

        String kuvaus = "";

        while (ay != by || ax != bx) {

            kuvaus = merkki[tiedot[by][bx][1]]+kuvaus;

            int uy = tiedot[by][bx][2];

            int ux = tiedot[by][bx][3];

            by = uy; bx = ux;

        }

        return kuvaus;

    }

}
*/