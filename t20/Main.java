import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        /*l.lisaaLoppuun(3);
        l.lisaaLoppuun(5);
        System.out.println(l.haeAlkio(1)); // 5
        l.lisaaAlkuun(2);
		//l.lisaaAlkuun(7);
		//l.lisaaLoppuun(6);
        System.out.println(l.haeAlkio(1)); // 3 */
		
		l.lisaaLoppuun(1);
        l.lisaaAlkuun(2);
        l.lisaaLoppuun(3);
        l.lisaaAlkuun(4);
        l.lisaaLoppuun(5);
        boolean virhe = false;
        System.out.println(l.haeAlkio(0)); //4
        System.out.println(l.haeAlkio(1)); //2
        System.out.println(l.haeAlkio(2)); //1
        System.out.println(l.haeAlkio(3)); //3
        System.out.println(l.haeAlkio(4)); //5
		
		System.out.println("Taulukko: ");
		for (int i=0;i<l.t.length;i++){
			System.out.print(l.t[i]+" ");
		}
		System.out.println("Loppu: "+l.loppu+" Alku: "+l.alku);
    }
}