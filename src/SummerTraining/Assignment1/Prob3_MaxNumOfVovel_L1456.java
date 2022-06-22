package SummerTraining.Assignment1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class Prob3_MaxNumOfVovel_L1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution3 sol3 = new Solution3();



        System.out.print("Enter the string : ");
        String s = sc.next();
        System.out.print("Enter k : ");
        int k= sc.nextInt();
        System.out.println(sol3.maxVowels(s,k));
    }
}
class Solution3 {
    public int maxVowels(String s, int k) {
        char[] sArr = s.toCharArray();
        int l = 0, h = 0;
        int ans = 0, tmpVowels = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(; h<sArr.length; h++){
            tmpVowels += vowels.contains(s.charAt(h)) ? 1:0;
            tmpVowels -= h>=k && vowels.contains(s.charAt(l)) ? 1:0;
            l += h>=k ? 1:0;
            ans = Math.max(ans, tmpVowels);
        }

        return ans;
    }
}
