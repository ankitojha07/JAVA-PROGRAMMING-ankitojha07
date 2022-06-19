package Algorithms.Recursion;
import java.util.Scanner;

public class RecursionJava {
    public static void main(String[] args) {
        int n = 0;
        printElem(n);
    }
    static void printElem(int n){
        if (n==100){
            return;
        }
        System.out.print(n + " ");
        printElem(n+1);
    }
}