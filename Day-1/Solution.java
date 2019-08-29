import java.util.*;

public class Solution{

    //Driver code
    public static void main(String[] args) {

        int arr[] = {10,15,3,7};
        int k = 18;
        System.out.println(isSumExist(arr,k));
    }

    public static Boolean isSumExist(int[] arr,int target) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(set.contains(target-arr[i])) return true;
            else set.add(arr[i]);
        }
        return false;
    }
}