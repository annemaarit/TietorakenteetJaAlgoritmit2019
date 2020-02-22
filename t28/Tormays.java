import java.util.*;

public class Tormays {
	HashMap<Integer,String>lasketut=new HashMap<>();
	String a;
	String b;
	
    String merkkijono1() {
		int n=200;
		int kpl=0;
		int max=(int)Math.pow(2,n);
		int h;
		boolean valmis=false;
		do{
			do{
				a=arvoSana(n);
				h=a.hashCode();
				if(lasketut.containsKey(h)){
					if (!lasketut.get(h).equals(a)){
						b=lasketut.get(h);
						valmis=true;
					}		
				}else{
					lasketut.put(h,a);
					System.out.println("lisätään h: "+h+" sana: "+a);
					kpl++;
				}
			}while(!valmis&&kpl<max);
			kpl=0;
			n++;
		}while (!valmis);

		return a;
    }

    String merkkijono2() {
		return b;
    }
	
	String arvoSana(int n){
		char[] merkit=new char[n];
		Random r=new Random();
		int arpa;
		for(int i=0;i<n;i++){
			arpa=r.nextInt(2);
			if (arpa==0){
				merkit[i]='a';
			}else{
				merkit[i]='b';
			}
		}
		String sana=String.valueOf(merkit);
		return sana;		
	}

}

/*
import java.util.*;

 

public class Tormays {

    String merkkijono1() {

        return "babababaaaabababaaab";

    }

 

    String merkkijono2() {

        return "bbbbaabaabbbaaabaaaaa";

    }

 

    Random r = new Random(1337);

 

    String muodosta(int n) {

        String s = "";

        for (int i = 0; i < n; i++) {

            if (r.nextInt(2) == 0) s += "a";

            else s += "b";

        }

        return s;

    }

    

    void etsi() {

        HashMap<Integer,String> h = new HashMap<>();

        while (true) {

            String x = muodosta(20);

            h.put(x.hashCode(),x);

            String y = muodosta(21);

            if (h.containsKey(y.hashCode())) {

                System.out.println(h.get(y.hashCode()));

                System.out.println(y);

                break;

            }

        }

    }

}*/