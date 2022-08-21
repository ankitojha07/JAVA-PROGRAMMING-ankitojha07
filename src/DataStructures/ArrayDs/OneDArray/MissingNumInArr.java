package DataStructures.ArrayDs.OneDArray;

// find the missing number in given array b/w 1 to 10
public class MissingNumInArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9,10};
        // find sum of given array
        int sum1 = 0; // sum of array
        int sum2 = 0; // sum pf 1 to 10
        for (int i:arr
             ) {
            sum1+=i;
        }
        sum2 = 10*(10+1)/2;

        //substract sum1 from sum2 to find the missing  number
        int missingNum = sum2-sum1;
        System.out.println("Missing number in array is : "+ missingNum);
    }
}
