package DataStructures.ArrayDs.OneDArray;

public class CheckPermutation {
    public static void main(String[] args) {
        CheckPermutation cp = new CheckPermutation();
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {2,5,7,1,3,4,6};
        boolean ans = cp.checkPermutation(arr1,arr2);
        if (ans){
            System.out.println("Both arrays are permutation to each other!");
        } else System.out.println("They ar not permutation to each other!");
    }
    public boolean checkPermutation(int[] arr1, int[] arr2){
        int sum1=0, sum2=0, p1=1,p2=1;
        for (int i = 0; i <arr1.length ; i++) {
            sum1 += arr1[i];
            p1 += arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            sum2+=arr2[i];
            p2 += arr2[i];
        }
        if (sum1==sum2 && p1==p2){
            return true;
        } else return false;
    }
}
