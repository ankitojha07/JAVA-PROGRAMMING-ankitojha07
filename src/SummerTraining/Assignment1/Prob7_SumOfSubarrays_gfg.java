package SummerTraining.Assignment1;

public class Prob7_SumOfSubarrays_gfg {
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0,temp=0;
        for (int i = 0; i < n; i ++)
        {
            temp=0;
            for (int j = i; j < n; j ++)
            {
                temp+=arr[j];
                result += temp ;
            }
        }
        return result ;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3} ;
        int n = arr.length;
        System.out.println("Sum of SubArray : " + SubArraySum(arr, n));
    }
}
