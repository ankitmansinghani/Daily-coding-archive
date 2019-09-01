
/**
 * Day4
 */
public class Day4 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0 };
        System.out.println(getSmallestPosMissing(arr));

    }

    public static int getSmallestPosMissing(int[] arr) {

        // algo build up
        // 1)get size of array n
        // 2)start from left parse the array and set value with conditions
        // con1) if value is negative/zero/greater than size of array just skip to next
        // con2) if value is not in con1.. then set it to val-1 index( i.e: arr[val-1])
        // DO NOT INCREASE COUNTER.
        // 3)after complition of loop start parsing array from index 1.
        // if(index!=arr[index]) return index(smallest positive missing number)
        // if all matches then return size of the array as an answere.

        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] <= 0 || arr[i] >= n)
                i++;
            else if (arr[i] == i)
                i++;
            else {
                int temp = arr[arr[i]];
                int index = arr[i];
                arr[index] = arr[i];
                arr[i] = temp;

            }

        }
        for (int j = 1; j < n; j++) {
            if (arr[j] != j)
                return j;
        }
        return n;
    }
}