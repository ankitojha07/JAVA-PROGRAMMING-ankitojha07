package LPuClass;
import java.util.*;

public class LinkedhashMap {
    public static void main(String[] args) {
        Set<String> d = new LinkedHashSet<>();
        d.add("a");
        d.add("b");
        d.add("a");

        System.out.println(d);

        ArrayDeque ad = new ArrayDeque();
        ad.offer("k20pk");
        ad.offer("K20pk2");

        System.out.println("All elements : " + ad);
        System.out.println("poll elements : " + ad.poll());
        System.out.println("All elements : " + ad);
        System.out.println("peeking elements : " + ad.peek());
        System.out.println("All elements : " + ad);


    }
}
