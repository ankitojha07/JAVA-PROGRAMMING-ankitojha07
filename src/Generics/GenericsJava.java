package Generics;

import java.util.ArrayList;

public class GenericsJava {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(56);
        list.add(8);

        int num1 = list.get(1);

        System.out.println(num1);
    }
}