package CoreJava.Generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedGen {
    public static void display(List<?> ls){
        for (Object obj:ls){
            System.out.println("\r"+obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Number list : ");
        display(a1);

        List<String> a2  = Arrays.asList("One","Two","Three");
        display(a2);
    }
}
