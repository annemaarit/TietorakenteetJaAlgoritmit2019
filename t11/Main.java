import java.util.*;

public class Main {
    public static void main(String[] args) {
        Kierrokset k = new Kierrokset();
        System.out.println(k.laske(new int[] {4,1,3,2,5})); // 3
        System.out.println(k.laske(new int[] {1,2,3,4,5})); // 1
        System.out.println(k.laske(new int[] {5,4,3,2,1})); // 5
		System.out.println(k.laske(new int[] {5,9,10,4,6,3,2,8,1,7})); // 8
		System.out.println(k.laske(new int[] {9,7,6,4,1,5,10,8,2,3}));
    }
}