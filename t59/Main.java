import java.util.*;

public class Main {
    public static void main(String[] args) {
        Kurssit k = new Kurssit();
        k.lisaaKurssi("OHPE");
        k.lisaaKurssi("OHJA");
        k.lisaaKurssi("TIRA");
        k.lisaaKurssi("OHTE");
        k.lisaaVaatimus("OHPE","OHJA");
        k.lisaaVaatimus("OHJA","TIRA");
        k.lisaaVaatimus("OHJA","OHTE");
        System.out.println(k.muodosta()); // [OHPE, OHJA, OHTE, TIRA]

        k = new Kurssit();
        k.lisaaKurssi("OHPE");
        k.lisaaKurssi("OHJA");
        k.lisaaVaatimus("OHPE","OHJA");
        k.lisaaVaatimus("OHJA","OHPE");
        System.out.println(k.muodosta()); //null

        k = new Kurssit();
        k.lisaaKurssi("OHPE");
        k.lisaaKurssi("OHJA");
        k.lisaaKurssi("TIRA");
        k.lisaaKurssi("LAMA");
        System.out.println(k.muodosta());
    }
}