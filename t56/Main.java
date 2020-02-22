import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*LyhinReitti l = new LyhinReitti(5);
        l.lisaaTie(1,2,7);
        l.lisaaTie(2,4,2);
        l.lisaaTie(1,3,6);
        l.lisaaTie(3,4,5);
        l.lisaaTie(4,5,3);
        System.out.println(l.muodosta(1,5)); // [1, 2, 4, 5]*/
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
		System.out.println(l.muodosta(1,9));
    }
}
