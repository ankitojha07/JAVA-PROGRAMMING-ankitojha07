package DataStructures.ArrayDs.OneDArray;

import java.util.Arrays;

public class FindMedianSortedArrays_L4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
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