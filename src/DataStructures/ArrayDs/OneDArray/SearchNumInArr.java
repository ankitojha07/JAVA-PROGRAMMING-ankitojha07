package DataStructures.ArrayDs.OneDArray;

import java.util.Scanner;

public class SearchNumInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchNumInArr sna = new SearchNumInArr();
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int target;
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search : ");
        target = sc.nextInt();
        int ans = sna.search(arr,target);
        System.out.println("Element found at position : "+ans+1);
    }
    public int search(int[] arr, int num){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
