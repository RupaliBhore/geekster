// // HW_Find Me 6
// Given an array of size n with unique integer elements. And then take m as an integer input. Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print all the elements of the first array whose absolute values are present in the second array. You shouldn’t use any extra space.

// Input Format

// First line contains integer number n representing size of first array.

// Second line contains n integer inputs representing elements of first array.

// Third line contains integer number m representing size of second array.

// Fourth line contains m integer inputs representing elements of second array.

// Constraints

// 1 <= n,m <= 100000

// 0 <= arr1[i],arr2[i] <= 100000
// Output Format

// An series on integer element in single line.

// Sample Input 0

// 5
// 1 2 -2 4 -1
// 5
// 1 2 3 -2 5
// Sample Output 0

// 1 2 -2 -1 
// Explanation 0

// Second array contains only absolute value of 1 , 2 ,-2 and -1.


import java.util.*;

public class Q6 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of first array
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        // Input elements of first array
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input size of second array
        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        // Input elements of second array
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Iterate through arr1 and check if absolute value exists in arr2
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr1[i]);
            for (int j = 0; j < m; j++) {
                if (absValue == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}