package DataStructures.ArrayDs.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedianSortedArrays_L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedianSortedLogis medianSortedLogis = new MedianSortedLogis();

        System.out.print("Enter size of array 1 : ");
        int n1=sc.nextInt();
        int nums1[] = new int[n1];
        System.out.print("Enter elements of array 1 : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2 : ");
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        System.out.print("Enter elements of array 1 : ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(medianSortedLogis.findMedianSortedArrays(nums1,nums2));
    }
}
class MedianSortedLogis{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1+n2;
        int nums3[] = new int[n3];
        for(int i=0;i<n1;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            nums3[n1+i]=nums2[i];
        }
        Arrays.sort(nums3);
        if ((n3 % 2) != 0)
            return (double)nums3[n3 / 2];

        return (double)(nums3[(n3 - 1) / 2] + nums3[n3 / 2]) / 2.0;
    }
}
//  TC : O(N)
//  SC : O(N)