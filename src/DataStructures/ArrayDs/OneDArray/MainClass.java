package DataStructures.ArrayDs.OneDArray;

public class MainClass {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[]{1,2,5,6,8,9,2};

        int[] arr2;
        arr2 = new int[]{55,7,12,23,32,54,20};

//        System.out.println("Printing the largest element in array : "+LargestElementArray.largestElem(arr1));
//        System.out.println("Find Median Sorted Arrays result : "+FindMedianSortedArrays_L4.findMedianSortedArrays(arr1,arr2));
//        CheckIfArrayIsSorted.isSorted(arr1);
        System.out.println("Second largest is : " + SecondLargestElemArray.secLarge(arr1));
    }
}
