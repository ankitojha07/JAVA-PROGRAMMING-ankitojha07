package LeetcodeProbs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=sc.nextInt();
        System.out.println(PalindromeLogic.palindrome(n));
    }
}
class PalindromeLogic{
    public static int reverse(int n){
        int rem=0,rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static boolean palindrome(int n){
        int p = reverse(n);
        if (n==p){
            return true;
        }
        return false;
    }
}