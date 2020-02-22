public class Laskulauseke {
    public long laske(String s) {
		int[] numerot=new int[1000];
		int n=0;
		char[] merkit=new char[1000];
		int m=0;
		int koko=s.length();
		char[] lauseke=s.toCharArray();
		
		
		for (int i=0;i<koko;i++){
			if (Character.isDigit(lauseke[i])){
				//HUOM! peräkkäisten nro huomiointi
				
				numerot[n]=Character.getNumericValue(lauseke[i]);
				n++;
			}else{
				merkit[m]=lauseke[i];
				m++;
			}
		}
		
		int eka=numerot[0];
		int toka=numerot[1];
		int tulos=0;
		int k=0;
		int aputulos=0;
		if (merkit[k]=='*'){
			tulos=eka*toka;
		}
		if (merkit[k]=='+'){
			tulos=eka+toka;
		}
		k++;
		for (int i=2;i<n;i++){
			if (merkit[k]=='*'){
				tulos*=numerot[i];
			}
			if (merkit[k]=='+'){
				tulos+=numerot[i];
			}	
			if (merkit[k]=='('){
				//
				//
			}
		}
		
		return tulos;
		
    }
}
