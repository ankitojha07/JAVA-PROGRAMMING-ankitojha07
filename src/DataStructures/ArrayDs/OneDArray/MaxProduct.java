package DataStructures.ArrayDs.OneDArray;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct mp = new MaxProduct();
        int[] arr = {10,20,40,60,30,50};
        int[] result = mp.maxProduct(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] maxProduct(int[] arr){
        int[] ans = new int[2];
        int maxProduct =0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]*arr[j]>maxProduct){
                    maxProduct=arr[i]*arr[j];
                    ans= new int[] {arr[i],arr[j]};
                }
            }
        }
        return ans;
    }
}
