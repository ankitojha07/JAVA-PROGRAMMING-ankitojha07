package SummerTraining.Assignment1;

import java.util.Scanner;

public class Prob4_CheckIfWordIsvalid_L1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();
        Solution4 sol4 = new Solution4();
        System.out.println(sol4.isValid(s));
    }
}
class Solution4 {
    public boolean isValid(String s) {
            while(s.contains("abc")){
                s=s.replace("abc","");
            }
            if(s.isEmpty())return true;
            return false;
    }
}
