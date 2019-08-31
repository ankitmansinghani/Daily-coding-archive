import java.util.*;

public class Day2{

    //Driver code
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        getArray(arr);
        for (int var : arr) {
            System.out.print(var+",");
        }
        System.out.println();

    }
    // public static void getArray(int arr[]) {
    //     int arrmul = 1;
    //     for (int var : arr) {
    //         arrmul*=var;
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i]=arrmul/arr[i];
    //     }    
    // }

    //follow up method
    //code method long divisor : https://stackoverflow.com/questions/5284898/implement-division-with-bit-wise-operator

    //Method building left and right sub array so that multiply both to get index answer
    public static void getArray(int arr[]) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        
        int leftTrack=1;
        
        for (int i = 0; i < arr.length; i++) {
            left[i]=leftTrack;
            leftTrack*=arr[i];
            int j=i+1;
            int rightTrack=1;
            while(j<arr.length)
            {
                rightTrack*=arr[j];
                j++;
            }
            right[i]=rightTrack;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=left[i]*right[i];
        }
    }


}