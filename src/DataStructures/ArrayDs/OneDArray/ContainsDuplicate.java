package DataStructures.ArrayDs.OneDArray;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr = {1,2,4,5,6,3};
        boolean result = cd.isUnique(arr);
        System.out.println(result);
    }
    public boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
