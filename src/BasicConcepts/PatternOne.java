package BasicConcepts;

import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total numbers of rows in pattern : ");
        int n= sc.nextInt();
        for (int i=1;i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
