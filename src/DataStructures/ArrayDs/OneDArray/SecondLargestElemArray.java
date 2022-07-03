package DataStructures.ArrayDs.OneDArray;

public class SecondLargestElemArray {
    static int secLarge(int[] arr){
        int largest = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>largest){
                sec_large = largest;
                largest = arr[i];
            } else if(arr[i]>sec_large && arr[i]!=largest){
                sec_large = arr[i];
            }
        }
        return sec_large;
    }
}
