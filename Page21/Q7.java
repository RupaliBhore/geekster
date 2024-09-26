// // HW_GKSTR36 Count_IndexValue_Element

// Given an integer n, the task is to define an array arr[] of size n &

// Print the count of element whose value is equal to its index value,

// For Ex:- if the value, "4" is present at arr[4] , therefore it would qualify as an element whose value is equal to its index value.

// Input Format

// An integer n, which is the size of the array arr[]

// n integers each in a new line, depicting the elements of the array arr[]

// Constraints

// - 0 <= arr.length <= 1000
    
// - 0 <= arr[i] <= 1000
// Output Format

// Single line of output

// An integer, which is the number of elements in the array, whose value is equal to its index value.

// Sample Input 0

// 5
// 4
// 1
// 5
// 3
// 5
// Sample Output 0

// 2
// Explanation 0

// Since the array is of length 5 and it's elements are {4, 1, 5, 3, 5} therefore count of elements whose value is equal to it's index value will be 2, As elements at index 1 and 3 are the only ones with value equal to its index value (arr[1] == 1, arr[3] == 3)

import java.util.*;

public class Q7 {

      public static int countEqualValueIndex(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count the number of elements with value equal to index
        int count = countEqualValueIndex(arr, n);

        // Print the result
        System.out.println(count);

        scanner.close();
    }
}