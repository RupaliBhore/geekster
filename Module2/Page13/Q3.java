// Find The Index of Rotation
// Given a sorted and rotated array. Find the index at which the array is rotated using binary search.

// Input Format

// An integer number n represeting size of array.
// N number representing elements of array.
// Constraints

// 1 <= n <= 10^4
// 1 <= arr[i] <= 10^9
// Output Format

// An integer value

// Sample Input 0

// 5
// 5 1 2 3 4
// Sample Output 0

// 0
// Explanation 0

// since value at index 0 is greater than index 1.


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int pivot = findPivot(arr, 0, n - 1);
        System.out.println(pivot);
    }

    public static int findPivot(int[] arr, int low, int high) {
        
        if (high < low) {
            return 0;
        }
        if (high == low) {
            return low;
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[low] > arr[mid]) {
                // return findPivot(arr, low, mid - 1);
                high = mid-1;
            }else {
                low = mid+1;
            }
            // return findPivot(arr, mid + 1, high);
            
        }
        return low;
    }
}
//bOLO JAI MATA DI