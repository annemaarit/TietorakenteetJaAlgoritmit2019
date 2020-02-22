public class Osajonot {
    int laske(String a, String b) {
		int pituus=a.length()-b.length()+1;
		int i=a.indexOf(b);
		int kpl=0;
		while((i!=-1)&&(i<pituus)){
			kpl++;
			i++;
			i=a.indexOf(b,i);
		}
		return kpl;
    }
}

/*
public class Osajonot {

    int laske(String a, String b) {

        int tulos = 0;

        for (int i = 0; i+b.length() <= a.length(); i++) {

            if (a.substring(i,i+b.length()).equals(b)) {

                tulos++;

            }

        }

        return tulos;

    }

}
*/