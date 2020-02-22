public class Numerot {
    int summa(int x) {
		char[] numerot=String.valueOf(x).toCharArray();
		int pituus = numerot.length;
		int summa = 0;
		for (int i=0;i<pituus;i++){
			summa=summa+Character.getNumericValue(numerot[i]);
		}
		return summa;
    }
}

/*
public class Numerot {

    int summa(int x) {

        int tulos = 0;

        while (x != 0) {

            tulos += x%10;

            x /= 10;

        }

        return tulos;

    }

}
*/