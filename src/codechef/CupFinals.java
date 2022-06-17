package codechef;
import java.util.Scanner;

class Solution{
    public void sol(int a, int b, int c){
        int large,small;
        if (a>b){
            large = a;
            small = b;
        } else {
            large = b;
            small = b;
        }
        if (large-small<=c){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
public class CupFinals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution sol= new Solution();
        int t,a,b,c;
        t = sc.nextInt();
        for (int i =0; i<t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            sol.sol(a,b,c);
        }
    }
}
