package DataStructures.ArrayDs.OneDArray;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {1,3,6,9,2,35,7,12};
        int[] solution = ts.findSum(arr,15);
        System.out.println(Arrays.toString(solution));
    }
    public int[] findSum(int[] arr, int target){
        for (int i=0; i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found!");
    }
}
