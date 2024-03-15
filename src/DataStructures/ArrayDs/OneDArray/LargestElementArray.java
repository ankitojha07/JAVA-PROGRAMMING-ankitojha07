package DataStructures.ArrayDs.OneDArray;

import java.sql.Array;
import java.util.Scanner;

public class LargestElementArray {
    static int largestElem(int[] arr){
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp<arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        System.out.println("Enter the next "+ (arr1.length-1) +" elements of the array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int largeElement = largestElem(arr1);
        System.out.println("Largest element of the array is : "+largeElement);
    }
}
