package SummerTraining.Assignment1;

public class Prob8_FirstBadVersion_L278 {
    public static void main(String[] args) {

    }
}
// ANSWER BELOW : VersionControl clas is not present localhost that's why I have commented the solution

//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        int left = 0;
//        int right = n;
//
//        while(left < right){
//            int mid = left+(right-left)/2;
//            if(!isBadVersion(mid)){
//                left=mid+1;
//            }
//            else{
//                if(isBadVersion(mid-1)){
//                    right = mid-1;
//                }
//                else return mid;
//            }
//        }
//        return -1;
//    }
//}